package com.company.factorympatt;

class CarFactory extends VehicleFactory{
    @Override
    VehicleModel createModel(String vehicle) {
        return new CarModel();
    }
}
