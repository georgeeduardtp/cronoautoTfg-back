package com.georgeeduardtp.cronoautoTfgBack.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.georgeeduardtp.cronoautoTfgBack.dto.request.CarRequest;
import com.georgeeduardtp.cronoautoTfgBack.dto.response.CarsCardResponse;
import com.georgeeduardtp.cronoautoTfgBack.dto.response.CarsDetailResponse;
import com.georgeeduardtp.cronoautoTfgBack.services.CarsService;

@RestController
@CrossOrigin(origins = "*")
public class CarsController {


    private CarsService carsService;

    @Autowired
    public CarsController(CarsService carsService) {
        this.carsService = carsService;
    }

    @GetMapping("/cars")
    public List<CarsCardResponse> getCars() {
        return carsService.getAllCars();
    }

    @PostMapping("/cars")
    public CarsDetailResponse createCar(@RequestBody CarRequest carRequest) {
        return this.carsService.createCar(carRequest);
    }
}
