package com.example.jse.m02.s12.ex;

public class Exercise1 {
    public static void main(String[] args) {
    	
        // (1) for loop
    	for (int i = 0; i<10; i++) {
    		System.out.print(i);
    	}
    	System.out.print("\n");
        // (2) while loop
    	int i = 0;
    	while (i<10) {
    		System.out.print(i);
    		i++;
     	}
        // (3) do-while loop
    	System.out.print("\n");
    	i = 0;
    	do {
    		System.out.print(i);
    		i++;
    		
    	} while (i<10);
    }
}
