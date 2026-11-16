package com.pluralsight;

public class SemiTruck extends Vehicle{
    private boolean isLoaded;
    private boolean cargoDetaches;
    private String type; // Sleeper truck, day cab, custom hauler, sloped-nose truck

    public boolean isLoaded() {
        return isLoaded;
    }

    public void setLoaded(boolean loaded) {
        isLoaded = loaded;
    }

    public boolean isCargoDetaches() {
        return cargoDetaches;
    }

    public void setCargoDetaches(boolean cargoDetaches) {
        this.cargoDetaches = cargoDetaches;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
