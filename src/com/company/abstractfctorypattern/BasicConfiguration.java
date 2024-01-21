package com.company.abstractfctorypattern;

public class BasicConfiguration implements Configuration{

    @Override
    public String getConfigurationType() {
        return "Basic";
    }
}
