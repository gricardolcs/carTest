package com.carusage.carusage.model;


import com.carusage.carusage.enums.CarMode;

public class Tuesday implements Car {
    private final CarMode mode = CarMode.TUESDAY;
    @Override
    public CarMode getMode() {
        return mode;
    }

}
