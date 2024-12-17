package com.carusage.carusage.controller;


import com.carusage.carusage.dto.CarDTO;
import com.carusage.carusage.service.CarService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
public class CarController {
    private final CarService carService;
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping
    public String createCar(@RequestBody CarDTO carUsage) {

        return carService.getCarByUsage(carUsage);
    }
}

