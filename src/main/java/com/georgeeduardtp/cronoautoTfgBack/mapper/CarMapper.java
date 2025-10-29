package com.georgeeduardtp.cronoautoTfgBack.mapper;

import com.georgeeduardtp.cronoautoTfgBack.dto.response.CarsCardResponse;
import com.georgeeduardtp.cronoautoTfgBack.persistance.jpa.entity.CarsEntity;

public class CarMapper {
 public static CarsCardResponse toCarsCardResponse(CarsEntity carEntity) {
     return new CarsCardResponse(
            carEntity.getId(),
            carEntity.getBrand(),
            carEntity.getModel(),
            carEntity.getCarType(),
            carEntity.getImageUrl(),
            carEntity.getTags(),
            carEntity.getEngineType(),
            carEntity.getPrice(),
            carEntity.getOriginalPrice()
     );
 }
}
