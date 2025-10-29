
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
    description VARCHAR(2000),
    propietarios INTEGER,
    puertas INTEGER,
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


INSERT INTO cars (brand, model, car_type, year, color, mileage, tags, engine_type, price, original_price, image_url)
VALUES
('Toyota', 'Corolla', 'Sedan', 2020, 'Red', 15000, ARRAY['economical', 'compact']::TEXT[], 'Gasolina', 20000, 22000, 'https://www.carscoops.com/wp-content/uploads/2022/09/2023-Toyota-GR-Corolla-copy.jpg'),
('Ford', 'Mustang', 'Coupe', 2019, 'Blue', 10000, ARRAY['sporty', 'powerful']::TEXT[], 'Gasolina', 30000, 35000, 'https://s1.cdn.autoevolution.com/images/news/2022-mustang-shelby-gt500-heritage-edition-looks-fancy-wearing-brittany-blue-metallic-201824_1.jpg'),
('Tesla', 'Model 3', 'Sedan', 2021, 'White', 5000, ARRAY['electric', 'modern']::TEXT[], 'Eléctrico', 40000, 45000, 'https://tse2.mm.bing.net/th/id/OIP.cZn-LkcIKeiCCW-yXvPwqAHaEK?rs=1&pid=ImgDetMain&o=7&rm=3');
