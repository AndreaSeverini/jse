package com.example.jse.m06.s11.ex;

import java.util.logging.Logger;

// TODO: is-a Conditioning
public class Flat implements Conditioning{
    private static final Logger log = Logger.getGlobal();

    public Flat() {
        log.info("Flat created");
    }
    
    @Override
    public void setTemperature(int temp) {
    	log.info("Temperature setted to: "+temp);
    }

}
