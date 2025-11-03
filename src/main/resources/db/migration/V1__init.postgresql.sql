
CREATE SEQUENCE IF NOT EXISTS cars_id_seq;

CREATE TABLE IF NOT EXISTS cars (
    id BIGINT PRIMARY KEY DEFAULT nextval('cars_id_seq'),
    brand VARCHAR(100) NOT NULL,
    model VARCHAR(100) NOT NULL,
    car_type VARCHAR(50) NOT NULL,
    year INTEGER NOT NULL,
    color VARCHAR(50),
    mileage INTEGER,
    tags TEXT[],
    engine_type VARCHAR(50),
    price INTEGER,
    original_price INTEGER,
    image_url VARCHAR(255),
    potencia INTEGER,
    transmission VARCHAR(50),
    motor VARCHAR(50),
    etiqueta_ambiental VARCHAR(50),
    description VARCHAR(2000),
    propietarios INTEGER,
    puertas INTEGER,
    destacado BOOLEAN DEFAULT FALSE,
    created_at TIMESTAMP WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP
);

-- Índices principales para búsquedas frecuentes
CREATE INDEX IF NOT EXISTS idx_cars_brand_model ON cars(brand, model);
CREATE INDEX IF NOT EXISTS idx_cars_price_range ON cars(price) WHERE price IS NOT NULL;
CREATE INDEX IF NOT EXISTS idx_cars_year_desc ON cars(year DESC);

-- Índice especializado para arrays de tags
CREATE INDEX IF NOT EXISTS idx_cars_tags ON cars USING GIN(tags);

-- Índices para filtros comunes
CREATE INDEX IF NOT EXISTS idx_cars_type_year ON cars(car_type, year);
CREATE INDEX IF NOT EXISTS idx_cars_engine_mileage ON cars(engine_type, mileage) WHERE mileage IS NOT NULL;

-- Índice para ordenamiento temporal
CREATE INDEX IF NOT EXISTS idx_cars_created_at ON cars(created_at DESC);


INSERT INTO cars (brand, model, car_type, year, color, mileage, tags, engine_type, price, original_price, image_url, potencia, transmission, motor, etiqueta_ambiental, description, propietarios, puertas, destacado)
VALUES
('Toyota', 'Corolla', 'Sedan', 2020, 'Red', 15000, ARRAY['economical', 'compact']::TEXT[], 'Gasolina', 20000, 22000, 'https://www.carscoops.com/wp-content/uploads/2022/09/2023-Toyota-GR-Corolla-copy.jpg', 132, 'Manual', '1.8L', 'ECO', 'Sedán compacto y económico, ideal para uso urbano y familiar.', 2, 4, false),
('Ford', 'Mustang', 'Coupe', 2019, 'Blue', 10000, ARRAY['sporty', 'powerful']::TEXT[], 'Gasolina', 30000, 35000, 'https://s1.cdn.autoevolution.com/images/news/2022-mustang-shelby-gt500-heritage-edition-looks-fancy-wearing-brittany-blue-metallic-201824_1.jpg', 450, 'Automático', '5.0L V8', 'C', 'Coupé deportivo americano con motor V8, perfecto para los amantes de la velocidad.', 1, 2, true),
('Tesla', 'Model 3', 'Sedan', 2021, 'White', 5000, ARRAY['electric', 'modern']::TEXT[], 'Eléctrico', 40000, 45000, 'https://tse2.mm.bing.net/th/id/OIP.cZn-LkcIKeiCCW-yXvPwqAHaEK?rs=1&pid=ImgDetMain&o=7&rm=3', 283, 'Automático', 'Eléctrico', 'CERO', 'Sedán eléctrico de lujo con tecnología avanzada y autonomía extendida.', 1, 4, true),
('BMW', 'Serie 3', 'Sedan', 2022, 'Black', 8000, ARRAY['luxury', 'premium']::TEXT[], 'Gasolina', 45000, 48000, 'https://example.com/bmw-serie3.jpg', 184, 'Automático', '2.0L Turbo', 'C', 'Sedán premium alemán con acabados de lujo y tecnología de vanguardia.', 1, 4, true),
('Volkswagen', 'Golf', 'Hatchback', 2020, 'Gray', 12000, ARRAY['compact', 'reliable']::TEXT[], 'Gasolina', 25000, 27000, 'https://example.com/vw-golf.jpg', 150, 'Manual', '1.5L TSI', 'ECO', 'Compacto versátil y confiable, perfecto para la conducción diaria.', 2, 5, false),
('Audi', 'A4', 'Sedan', 2021, 'Silver', 6000, ARRAY['luxury', 'quattro']::TEXT[], 'Gasolina', 42000, 45000, 'https://example.com/audi-a4.jpg', 201, 'Automático', '2.0L TFSI', 'C', 'Sedán ejecutivo con tracción quattro y diseño elegante.', 1, 4, true),
('Honda', 'Civic', 'Sedan', 2019, 'White', 18000, ARRAY['reliable', 'economic']::TEXT[], 'Gasolina', 22000, 25000, 'https://example.com/honda-civic.jpg', 158, 'CVT', '1.5L Turbo', 'ECO', 'Sedán japonés conocido por su fiabilidad y eficiencia de combustible.', 2, 4, false),
('Mercedes-Benz', 'Clase C', 'Sedan', 2022, 'Blue', 4000, ARRAY['luxury', 'premium']::TEXT[], 'Gasolina', 50000, 53000, 'https://example.com/mercedes-c-class.jpg', 204, 'Automático', '2.0L Turbo', 'C', 'Sedán de lujo alemán con tecnología avanzada y confort superior.', 1, 4, true),
('Nissan', 'Altima', 'Sedan', 2020, 'Red', 14000, ARRAY['comfortable', 'spacious']::TEXT[], 'Gasolina', 28000, 30000, 'https://example.com/nissan-altima.jpg', 188, 'CVT', '2.5L', 'ECO', 'Sedán mediano espacioso y cómodo para viajes largos.', 2, 4, false),
('Hyundai', 'Elantra', 'Sedan', 2021, 'Gray', 9000, ARRAY['modern', 'warranty']::TEXT[], 'Gasolina', 24000, 26000, 'https://example.com/hyundai-elantra.jpg', 147, 'Automático', '2.0L', 'ECO', 'Sedán moderno con excelente garantía y características de seguridad avanzadas.', 1, 4, false),
('Kia', 'Optima', 'Sedan', 2019, 'Black', 16000, ARRAY['stylish', 'value']::TEXT[], 'Gasolina', 26000, 28000, 'https://example.com/kia-optima.jpg', 185, 'Automático', '2.4L', 'ECO', 'Sedán estiloso con excelente relación calidad-precio.', 2, 4, false),
('Chevrolet', 'Malibu', 'Sedan', 2020, 'White', 11000, ARRAY['american', 'spacious']::TEXT[], 'Gasolina', 27000, 29000, 'https://example.com/chevrolet-malibu.jpg', 160, 'Automático', '1.5L Turbo', 'ECO', 'Sedán americano espacioso con tecnología moderna.', 1, 4, false),
('Mazda', 'Mazda6', 'Sedan', 2021, 'Red', 7000, ARRAY['sporty', 'premium']::TEXT[], 'Gasolina', 32000, 34000, 'https://example.com/mazda6.jpg', 227, 'Automático', '2.5L Turbo', 'ECO', 'Sedán deportivo con diseño elegante y manejo excepcional.', 1, 4, true),
('Subaru', 'Legacy', 'Sedan', 2020, 'Blue', 13000, ARRAY['awd', 'safe']::TEXT[], 'Gasolina', 29000, 31000, 'https://example.com/subaru-legacy.jpg', 182, 'CVT', '2.5L', 'ECO', 'Sedán con tracción integral estándar y excelentes calificaciones de seguridad.', 2, 4, false);


-- 1. Crear la tabla de Roles (para ROLE_USER, ROLE_OWNER, ROLE_ADMIN)
CREATE TABLE roles (
    id SERIAL PRIMARY KEY,
    name VARCHAR(20) NOT NULL
);

-- 2. Crear la tabla de Usuarios
CREATE TABLE users (
    id BIGSERIAL PRIMARY KEY,
    username VARCHAR(20) NOT NULL,
    email VARCHAR(50) NOT NULL,
    password VARCHAR(120) NOT NULL
);

-- 3. Añadir las constraints 'unique' de la anotación @Table
ALTER TABLE users
    ADD CONSTRAINT UK_users_username UNIQUE (username),
    ADD CONSTRAINT UK_users_email UNIQUE (email);

-- 4. Crear la tabla intermedia para la relación @ManyToMany
CREATE TABLE user_roles (
    user_id BIGINT NOT NULL,
    role_id INTEGER NOT NULL,
    PRIMARY KEY (user_id, role_id),
    CONSTRAINT FK_user_roles_user FOREIGN KEY (user_id) REFERENCES users(id),
    CONSTRAINT FK_user_roles_role FOREIGN KEY (role_id) REFERENCES roles(id)
);

-- 5. ¡IMPORTANTE! Insertar los roles base que tu aplicación necesita
INSERT INTO roles(name) VALUES('ROLE_USER');
INSERT INTO roles(name) VALUES('ROLE_MODERATOR');
INSERT INTO roles(name) VALUES('ROLE_ADMIN');