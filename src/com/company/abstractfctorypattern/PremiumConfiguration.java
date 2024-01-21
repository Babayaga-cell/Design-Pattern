package com.company.abstractfctorypattern;

public class PremiumConfiguration implements Configuration{

    @Override
    public String getConfigurationType() {
        return "Premium";
    }
}
