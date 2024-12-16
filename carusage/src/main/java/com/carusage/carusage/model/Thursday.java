package com.carusage.carusage.model;

import com.carusage.carusage.enums.CarMode;

public class Thursday implements Car {
    private final CarMode mode = CarMode.THURSDAY;
    @Override
    public CarMode getMode() {
        return mode;
    }
}
