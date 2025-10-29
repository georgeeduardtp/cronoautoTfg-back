package com.georgeeduardtp.cronoautoTfgBack.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.georgeeduardtp.cronoautoTfgBack.dto.request.CarRequest;
import com.georgeeduardtp.cronoautoTfgBack.dto.response.CarsCardResponse;
import com.georgeeduardtp.cronoautoTfgBack.dto.response.CarsDetailResponse;
import com.georgeeduardtp.cronoautoTfgBack.mapper.CarMapper;
import com.georgeeduardtp.cronoautoTfgBack.persistance.jpa.entity.CarsEntity;
import com.georgeeduardtp.cronoautoTfgBack.persistance.jpa.entity.repository.CarsJpaRepository;
import com.georgeeduardtp.cronoautoTfgBack.services.CarsService;

@Service
public class CarsServiceImpl implements CarsService {


    private final CarsJpaRepository carsRepository;
    @Autowired
    public CarsServiceImpl(CarsJpaRepository carsRepository) {
        this.carsRepository = carsRepository;
    }

    @Override
    public List<CarsCardResponse> getAllCars() {
      return this.carsRepository.findAll().stream()
              .map(CarMapper::toCarsCardResponse) //toCarsCardResponse es un método estático de la clase CarMapper que convierte un CarsEntity en un CarsCardResponse
              .toList();
        
    }

    @Override
    public CarsDetailResponse createCar(CarRequest carRequest) {
        CarsEntity carEntity = new CarsEntity();
        carEntity.setBrand(carRequest.brand());
        carEntity.setModel(carRequest.model());
        carEntity.setCarType(carRequest.car_type());
        carEntity.setImageUrl(carRequest.imageUrl());
        carEntity.setYear(carRequest.year());
        carEntity.setMileage(carRequest.mileage());
        carEntity.setTags(carRequest.tags());
        carEntity.setEngineType(carRequest.engine_type());
        carEntity.setPrice(carRequest.price());
        carEntity.setOriginalPrice(carRequest.original_price());

        carEntity.setPotencia(carRequest.potencia());
        carEntity.setTransmission(carRequest.transmission());
        carEntity.setMotor(carRequest.motor());
        carEntity.setDescription(carRequest.description());
        carEntity.setPropietarios(carRequest.propietarios());
        carEntity.setPuertas(carRequest.puertas());
        
        this.carsRepository.save(carEntity);
        return CarMapper.toCarsDetailResponse(carEntity);
    }
    
}
