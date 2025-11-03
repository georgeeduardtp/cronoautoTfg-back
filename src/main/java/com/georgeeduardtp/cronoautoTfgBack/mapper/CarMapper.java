package com.georgeeduardtp.cronoautotfgback.mapper;

import com.georgeeduardtp.cronoautotfgback.dto.response.CarsCardResponse;
import com.georgeeduardtp.cronoautotfgback.dto.response.CarsDetailResponse;
import com.georgeeduardtp.cronoautotfgback.persistance.jpa.entity.CarsEntity;

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
            carEntity.getOriginalPrice(),
            carEntity.getDestacado()
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
        carEntity.getEtiquetaAmbiental(),
        carEntity.getDescription(),
        carEntity.getPropietarios(),
        carEntity.getPuertas(),
        carEntity.getDestacado()
    );
 }
}
