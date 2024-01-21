package com.company.abstractfctorypattern;

public class Smartphone implements Device{
    @Override
    public String getDeviceType() {
        return "Smartphone";
    }

    @Override
    public String getModel() {
        return "ABC Smartphone";
    }

}
