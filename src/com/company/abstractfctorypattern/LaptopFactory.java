package com.company.abstractfctorypattern;

public class LaptopFactory extends DeviceFactory{

    @Override
    Device createDevice() {
        return new Laptop();
    }

    @Override
    Configuration createConfiguration(String configuration) {
        if (configuration.equals("Basic")){
            return new BasicConfiguration();
        }
        return new PremiumConfiguration();
    }
}
