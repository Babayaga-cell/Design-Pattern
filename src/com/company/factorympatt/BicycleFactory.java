package com.company.factorympatt;

public class BicycleFactory extends VehicleFactory{
    @Override
    VehicleModel createModel(String vehicle) {
        return new BicycleModel();
    }
}
