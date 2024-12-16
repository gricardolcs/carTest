package com.carusage.carusage.service;


import com.carusage.carusage.dto.CarDTO;
import com.carusage.carusage.enums.CarMode;
import com.carusage.carusage.factory.CarFactory;
import com.carusage.carusage.model.Car;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class CarService {

    private final CarFactory carFactory;

    public CarService(CarFactory carFactory) {
        this.carFactory = carFactory;
    }

    public String getCarByUsage(CarDTO carTypeStr) {

        // getting car mode
        String carUsageMode = carTypeStr.getCarUsage();
        CarMode carMode = CarMode.fromValue(carTypeStr.getCarUsage());
        if (Objects.isNull(carUsageMode)) {
            return  "Car can not created. Car type is invalid!";
        }

        if (carUsageMode.equals("Friday") &&
                !carTypeStr.getIsCamouflage() &&
                    !carTypeStr.getIsArmed()) {
            return "Car can not created. Car type is invalid!";
        }

        // creating car by mode
        Car car = carFactory.createCarByMode(carMode);

        // preparing information message
        String message = switch (car.getMode()) {
            case MONDAY -> "Street usage";
            case TUESDAY -> "Sport racing usage";
            case WEDNESDAY, THURSDAY -> "Off road usage";
            case FRIDAY -> "Secret agent usage";
        };
        message += " Car has produced.";

        return message;
    }
}
