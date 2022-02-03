package com.example.jse.m06.s11.ex;

import java.util.logging.Logger;

// TODO: is-a Vehicle and Conditioning
public class Bus extends Vehicle implements Conditioning{
    private static final Logger log = Logger.getGlobal();

    public Bus() {
        log.info("Bus created");
    }
    @Override
    public void setTemperature(int temp) {
    	log.info("Temperature setted to: "+temp);
    }
}
