package com.example.jse.m06.s11.ex;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // TODO: (1) put objects of (at least) three different types in this array
        Vehicle[] vehicles = {new Car(), new Bus(), new MotorBike()};
        System.out.println(Arrays.toString(vehicles));

        // TODO: (2) let all vehicle steer in alternate directions
        for(int i = 0;i<vehicles.length;i++) {
        	if(i==0 || i%2==0) {
        		vehicles[i].steer(true);
        	} else {
        		vehicles[i].steer(false);
        		
        	}
        	
        }
        
        // TODO: (3) put objects of (at least) three different types in this array
        Conditioning[] conditioned = {new Bus(), new Car(), new Flat()};
        System.out.println(Arrays.toString(conditioned));

        // TODO: (4) set the temperature of each conditioned to 20
        for(Conditioning item:conditioned) {
        	item.setTemperature(20);
        }
    }
}
