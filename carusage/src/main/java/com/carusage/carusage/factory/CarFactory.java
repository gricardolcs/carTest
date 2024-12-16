package com.carusage.carusage.factory;


import com.carusage.carusage.enums.CarMode;
import com.carusage.carusage.model.*;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class CarFactory {

    public Car createCarByMode(CarMode carMode) {


        if (Objects.isNull(carMode)) {
            return null;
        }

        Car car = null;
        switch (carMode) {
            case MONDAY: car = new Monday();break;
            case TUESDAY: car = new Tuesday(); break;
            case WEDNESDAY: car = new Wednesday();
            case THURSDAY: car = new Thursday();
            case FRIDAY: car = new Friday();
        }

        return car;

    }
}
