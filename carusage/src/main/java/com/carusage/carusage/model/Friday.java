package com.carusage.carusage.model;


import com.carusage.carusage.enums.CarMode;

public class Friday implements Car {
    private final CarMode mode = CarMode.FRIDAY;
    @Override
    public CarMode getMode() {
        return mode;
    }
}
