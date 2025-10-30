package com.georgeeduardtp.cronoautoTfgBack.dto.response;

import java.util.List;

public record CarsDetailResponse(
    Long id,
    String brand,
    String model,
    String car_type,
    String imageUrl,
    Integer year,
    Integer mileage,
    List<String> tags,
    String engine_type,
    Integer price,
    Integer original_price,
    Integer potencia,
    String transmission,
    String motor,
    String etiquetaAmbiental,
    String description,
    Integer propietarios,
    Integer puertas,
    Boolean destacado
    
) {

    
}
