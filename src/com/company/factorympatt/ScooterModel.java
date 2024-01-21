package com.company.factorympatt;

public class ScooterModel implements VehicleModel{
    @Override
    public String getBrand() {
        return "Xiaomi";
    }

    @Override
    public String getModel() {
        return "Mi Electric Scooter";
    }

    @Override
    public String getFuelType() {
        return "Electric";
    }
}
