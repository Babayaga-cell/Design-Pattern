package com.company.factorympatt;

class CarModel implements VehicleModel {
    @Override
    public String getBrand() {
        return "Toyota";
    }

    @Override
    public String getModel() {
        return "Camry";
    }

    @Override
    public String getFuelType() {
        return "Petrol";
    }
}
