package com.georgeeduardtp.cronoautoTfgBack.services;

import java.util.List;

import com.georgeeduardtp.cronoautoTfgBack.dto.request.CarRequest;
import com.georgeeduardtp.cronoautoTfgBack.dto.response.CarsCardResponse;
import com.georgeeduardtp.cronoautoTfgBack.dto.response.CarsDetailResponse;

public interface CarsService {

    List<CarsCardResponse> getAllCars();
    CarsDetailResponse createCar(CarRequest carRequest);
}
