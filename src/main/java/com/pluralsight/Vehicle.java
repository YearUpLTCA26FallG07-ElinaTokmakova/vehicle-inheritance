package com.pluralsight;

public enum Vehicle {
    Moped,
    SemiTruck,
    Hovercraft,
    Car;

    private String color;
    private int numberOFPassengers;
    private int cargoCapacity;
    private int fuelCapacity;
    private int maxSpeed;
    private boolean requiresHelmet;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOFPassengers() {
        return numberOFPassengers;
    }

    public void setNumberOFPassengers(int numberOFPassengers) {
        this.numberOFPassengers = numberOFPassengers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean isRequiresHelmet() {
        return requiresHelmet;
    }

    public void setRequiresHelmet(boolean requiresHelmet) {
        this.requiresHelmet = requiresHelmet;
    }
}
