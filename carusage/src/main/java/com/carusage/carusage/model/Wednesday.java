package com.carusage.carusage.model;

import com.carusage.carusage.enums.CarMode;

public class Wednesday implements Car{
    private final CarMode mode = CarMode.WEDNESDAY;
    @Override
    public CarMode getMode() {
        return mode;
    }
}
