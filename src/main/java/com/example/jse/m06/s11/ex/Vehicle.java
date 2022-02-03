package com.example.jse.m06.s11.ex;

import java.util.logging.Logger;

// TODO: it should steer left/right, it should brake
public class Vehicle {
    private static final Logger log = Logger.getGlobal();

    public Vehicle() {
        log.info("Vehicle created");
    }
    
    public void steer(boolean steer) {
    	if(steer == true) {
    		log.info("Steering Right");
    	} else {
    		log.info("Steering Left");
    	}
    }
    public void brake() {
    	log.info("Braking");
    }
}
