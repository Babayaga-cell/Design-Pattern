package com.company.factorympatt;

public class ScooterFactory extends VehicleFactory{

    @Override
    VehicleModel createModel(String vehicle) {
        return new ScooterModel();
    }
}
