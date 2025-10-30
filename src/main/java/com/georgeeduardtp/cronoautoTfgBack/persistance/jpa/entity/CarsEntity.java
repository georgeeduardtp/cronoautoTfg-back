package com.georgeeduardtp.cronoautoTfgBack.persistance.jpa.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cars")
public class CarsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String brand;

    @Column(nullable = false)
    private String model;

    @Column(name = "car_type", nullable = false)
    private String carType;

    @Column(nullable = false)
    private Integer year;

    @Column
    private String color;

    @Column
    private Integer mileage;

    @Column(columnDefinition = "text[]")
    @org.hibernate.annotations.JdbcTypeCode(org.hibernate.type.SqlTypes.ARRAY)
    private List<String> tags;

    @Column(name = "engine_type")
    private String engineType;

    @Column
    private Integer price;

    @Column(name = "original_price")
    private Integer originalPrice;

    @Column(name = "image_url")
    private String imageUrl;

    @Column
    private Integer potencia;

    @Column
    private String transmission;

    @Column
    private String motor;

 
    @Column(name = "etiqueta_ambiental")
    private String etiquetaAmbiental;

    @Column(name = "description")
    private String description;

    @Column
    private Integer propietarios;

    @Column
    private Integer puertas;

    @Column
    private Boolean destacado;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
    
    public CarsEntity() {
    }

    public CarsEntity(Long id, String brand, String model, String carType,String imageUrl, Integer year , Integer mileage,
            List<String> tags, String engineType, Integer price, Integer originalPrice, Integer potencia, String transmission,
            String motor, String etiquetaAmbiental, String description, Integer propietarios, Integer puertas, Boolean destacado) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.carType = carType;
        this.imageUrl = imageUrl;
        this.year = year;
        this.mileage = mileage;
        this.tags = tags;
        this.engineType = engineType;
        this.price = price;
        this.originalPrice = originalPrice;
        this.potencia = potencia;
        this.transmission = transmission;
        this.motor = motor;
        this.etiquetaAmbiental = etiquetaAmbiental;
        this.description = description;
        this.propietarios = propietarios;
        this.puertas = puertas;
        this.destacado = destacado;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getCarType() {
        return carType;
    }
    public void setCarType(String carType) {
        this.carType = carType;
    }

    public Integer getYear() {
        return year;
    }
    public void setYear(Integer year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public Integer getMileage() {
        return mileage;
    }
    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public List<String> getTags() {
        return tags;
    }
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getEngineType() {
        return engineType;
    }
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
    
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getOriginalPrice() {
        return originalPrice;
    }
    public void setOriginalPrice(Integer originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getPotencia() {
        return potencia;
    }
    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    public String getTransmission() {
        return transmission;
    }
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getMotor() {
        return motor;
    }
    public void setMotor(String motor) {
        this.motor = motor;
    }

    
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPropietarios() {
        return propietarios;
    }
    public void setPropietarios(Integer propietarios) {
        this.propietarios = propietarios;
    }

    public Integer getPuertas() {
        return puertas;
    }
    public void setPuertas(Integer puertas) {
        this.puertas = puertas;
    }
    public String getEtiquetaAmbiental() {
        return etiquetaAmbiental;
    }
    public void setEtiquetaAmbiental(String etiquetaAmbiental) {
        this.etiquetaAmbiental = etiquetaAmbiental;
    }
    public Boolean getDestacado() {
        return destacado;
    }
    public void setDestacado(Boolean destacado) {
        this.destacado = destacado;
    }
}
