package com.georgeeduardtp.cronoautoTfgBack.dto.response;

import java.util.List;

public record CarsCardResponse(
    Long id,
    String brand,
    String model,
    String car_type,
    String imageUrl,    
    List<String> tags,
    Integer price,
    Integer original_price

) {

}
