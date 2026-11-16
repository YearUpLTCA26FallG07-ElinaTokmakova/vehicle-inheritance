package com.pluralsight;

public class Moped extends Vehicle {
    private String mopedType; // pedaled, gas scooter, low-rider, high-speed
    private boolean isElectric;
    private boolean isLightweight;

    public String getMopedType() {
        return mopedType;
    }

    public void setMopedType(String mopedType) {
        this.mopedType = mopedType;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public boolean isLightweight() {
        return isLightweight;
    }

    public void setLightweight(boolean lightweight) {
        isLightweight = lightweight;
    }
}
