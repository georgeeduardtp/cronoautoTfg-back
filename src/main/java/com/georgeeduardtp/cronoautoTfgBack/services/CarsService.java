package com.georgeeduardtp.cronoautoTfgBack.services;

import java.util.List;

import com.georgeeduardtp.cronoautoTfgBack.dto.response.CarsCardResponse;

public interface CarsService {

    List<CarsCardResponse> getAllCars();
}
