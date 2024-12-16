package com.carusage.carusage.controller;


import com.carusage.carusage.dto.CarDTO;
import com.carusage.carusage.service.CarService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
    private final CarService carService;
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping(consumes = "text/plain")
    public String createCar(@RequestBody CarDTO carUsage) {

        return carService.getCarByUsage(carUsage);
    }
}

