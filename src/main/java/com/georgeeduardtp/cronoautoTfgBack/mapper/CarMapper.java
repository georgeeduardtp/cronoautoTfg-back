package com.georgeeduardtp.cronoautoTfgBack.mapper;

import com.georgeeduardtp.cronoautoTfgBack.dto.response.CarsCardResponse;
import com.georgeeduardtp.cronoautoTfgBack.dto.response.CarsDetailResponse;
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
 public static CarsDetailResponse toCarsDetailResponse(CarsEntity carEntity) {
    return new CarsDetailResponse(
        carEntity.getId(),
        carEntity.getBrand(),
        carEntity.getModel(),
        carEntity.getCarType(),
        carEntity.getImageUrl(),
        carEntity.getYear(),
        carEntity.getMileage(),
        carEntity.getTags(),
        carEntity.getEngineType(),
        carEntity.getPrice(),
        carEntity.getOriginalPrice(),
        carEntity.getPotencia(),
        carEntity.getTransmission(),
        carEntity.getMotor(),
       
        carEntity.getDescription(),
        carEntity.getPropietarios(),
        carEntity.getPuertas()
    );
 }
}
