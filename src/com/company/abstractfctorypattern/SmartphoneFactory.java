package com.company.abstractfctorypattern;

public class SmartphoneFactory extends DeviceFactory{

    @Override
    Device createDevice() {
        return new Smartphone();
    }

    @Override
    Configuration createConfiguration(String configuration) {
        if (configuration.equals("Basic")){
            return new BasicConfiguration();
        }
        return new PremiumConfiguration();
    }
}
