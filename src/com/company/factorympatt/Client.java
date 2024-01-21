package com.company.factorympatt;

public class Client {
    public static void main(String[] args) {
        // Factory Method Pattern

        VehicleFactory carFactory = new CarFactory();
        VehicleModel sedan = carFactory.createModel("Sedan");
        displayVehicleDetails(sedan);

        VehicleFactory bicycleFactory = new BicycleFactory();
        VehicleModel mountainBike = bicycleFactory.createModel("Mountain Bike");
        displayVehicleDetails(mountainBike);

        VehicleFactory scooterFactory = new ScooterFactory();
        VehicleModel electricScooter = scooterFactory.createModel("Electric Scooter");
        displayVehicleDetails(electricScooter);

    }
    private static void displayVehicleDetails(VehicleModel vehicleModel) {
        System.out.println("Vehicle Details:");
        System.out.println("Brand: " + vehicleModel.getBrand());
        System.out.println("Model: " + vehicleModel.getModel());
        System.out.println("Fuel Type: " + vehicleModel.getFuelType());
        System.out.println();
    }
}
