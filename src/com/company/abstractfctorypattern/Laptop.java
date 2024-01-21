package com.company.abstractfctorypattern;

public class Laptop implements Device{
    @Override
    public String getDeviceType() {
        return "Laptop";
    }

    @Override
    public String getModel() {
        return "XYZ Laptop";
    }

}
