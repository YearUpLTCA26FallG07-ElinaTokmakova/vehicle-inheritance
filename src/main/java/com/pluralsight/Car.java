package com.pluralsight;

public class Car extends Vehicle {
    private String carType; // sedan, pickup, van, suv, convertible
    private boolean hasSpoiler;
    private String engineType; // gasoline, electric, hybrid, diesel

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public boolean isHasSpoiler() {
        return hasSpoiler;
    }

    public void setHasSpoiler(boolean hasSpoiler) {
        this.hasSpoiler = hasSpoiler;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}
