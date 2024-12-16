package com.carusage.carusage.enums;

public enum CarMode {

    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday");

    CarMode(String value) {
        this.value = value;
    }

    private final String value;

    public static CarMode fromValue(String value) {
        for (CarMode carMode : values()) {
            if (carMode.value.equals(value)) {
                return carMode;
            }
        }
        return null;
    }
}
