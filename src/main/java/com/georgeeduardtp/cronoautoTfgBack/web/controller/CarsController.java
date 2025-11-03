package com.georgeeduardtp.cronoautotfgback.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.georgeeduardtp.cronoautotfgback.dto.request.CarRequest;
import com.georgeeduardtp.cronoautotfgback.dto.response.CarsCardResponse;
import com.georgeeduardtp.cronoautotfgback.dto.response.CarsDetailResponse;
import com.georgeeduardtp.cronoautotfgback.services.CarsService;

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

    @GetMapping("/cars/{id}")
    public CarsDetailResponse getCarById(@PathVariable Long id) {
        return this.carsService.getCarById(id);
    }
    
    @PostMapping("/cars")
    public CarsDetailResponse createCar(@RequestBody CarRequest carRequest) {
        return this.carsService.createCar(carRequest);
    }

    @DeleteMapping("/cars/{id}")
    public void deleteCar(@PathVariable Long id) {
        this.carsService.deleteCar(id);
    }
}
