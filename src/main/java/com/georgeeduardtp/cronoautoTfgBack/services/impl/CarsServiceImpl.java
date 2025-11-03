package com.georgeeduardtp.cronoautotfgback.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.georgeeduardtp.cronoautotfgback.dto.request.CarRequest;
import com.georgeeduardtp.cronoautotfgback.dto.response.CarsCardResponse;
import com.georgeeduardtp.cronoautotfgback.dto.response.CarsDetailResponse;
import com.georgeeduardtp.cronoautotfgback.mapper.CarMapper;
import com.georgeeduardtp.cronoautotfgback.persistance.jpa.entity.CarsEntity;
import com.georgeeduardtp.cronoautotfgback.persistance.jpa.entity.repository.CarsJpaRepository;
import com.georgeeduardtp.cronoautotfgback.services.CarsService;

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
    public CarsDetailResponse getCarById(Long id) {
        CarsEntity carEntity = this.carsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Car not found with id: " + id));
        return CarMapper.toCarsDetailResponse(carEntity);
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
        carEntity.setEtiquetaAmbiental(carRequest.etiquetaAmbiental());
        carEntity.setPotencia(carRequest.potencia());
        carEntity.setTransmission(carRequest.transmission());
        carEntity.setMotor(carRequest.motor());
        carEntity.setDescription(carRequest.description());
        carEntity.setPropietarios(carRequest.propietarios());
        carEntity.setPuertas(carRequest.puertas());
        carEntity.setDestacado(carRequest.destacado());
        this.carsRepository.save(carEntity);
        return CarMapper.toCarsDetailResponse(carEntity);
    }

    @Override
    public void deleteCar(Long id) {
        this.carsRepository.deleteById(id);
    }
    
}
