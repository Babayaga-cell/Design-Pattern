package com.company.abstractfctorypattern;

public class Client {
    public static void main(String[] args) {
        // Abstract Factory Pattern

        // Create a laptop and its basic configuration
        DeviceFactory laptopFactory = new LaptopFactory();
        Device laptop = laptopFactory.createDevice();
        Configuration basicConfig = laptopFactory.createConfiguration("Basic");

        // Create a smartphone and its premium configuration
        DeviceFactory smartphoneFactory = new SmartphoneFactory();
        Device smartphone = smartphoneFactory.createDevice();
        Configuration premiumConfig = smartphoneFactory.createConfiguration("Premium");

        // Display details
        displayDetails(laptop, basicConfig);
        displayDetails(smartphone, premiumConfig);

    }

    private static void displayDetails(Device device, Configuration configuration) {
        System.out.println("Device Type: " + device.getDeviceType());
        System.out.println("Model: " + device.getModel());
        System.out.println("Configuration: " + configuration.getConfigurationType());
        System.out.println();
    }
}
