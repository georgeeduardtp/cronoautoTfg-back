package com.georgeeduardtp.cronoautotfgback.services;

import java.util.List;

import com.georgeeduardtp.cronoautotfgback.dto.request.CarRequest;
import com.georgeeduardtp.cronoautotfgback.dto.response.CarsCardResponse;
import com.georgeeduardtp.cronoautotfgback.dto.response.CarsDetailResponse;

public interface CarsService {

    List<CarsCardResponse> getAllCars();
    CarsDetailResponse createCar(CarRequest carRequest);
    CarsDetailResponse getCarById(Long id);
    void deleteCar(Long id);
    
}
