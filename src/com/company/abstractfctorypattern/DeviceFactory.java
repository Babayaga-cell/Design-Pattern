package com.company.abstractfctorypattern;

public abstract class DeviceFactory {
    abstract Device createDevice();
    abstract Configuration createConfiguration(String Configuration);
}
