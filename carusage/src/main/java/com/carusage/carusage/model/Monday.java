package com.carusage.carusage.model;


import com.carusage.carusage.enums.CarMode;

public class Monday implements Car{
    private final CarMode mode = CarMode.MONDAY;
    @Override
    public CarMode getMode() {
        return mode;
    }
}
