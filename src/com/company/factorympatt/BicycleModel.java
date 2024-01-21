package com.company.factorympatt;

public class BicycleModel implements VehicleModel{
    @Override
    public String getBrand() {
        return "Giant";
    }

    @Override
    public String getModel() {
        return "Talon";
    }

    @Override
    public String getFuelType() {
        return "None (Bicycle)";
    }
}
