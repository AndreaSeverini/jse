package com.example.jse.m02.s12.ex;

public class Exercise3 {
    public static void main(String[] args) {
        /*
         * 
         * (1) the number of arguments passed to this main
         * 
         * (2) each argument
         */
    	System.out.println(args.length);
    	for (String item : args) {
    		System.out.print(" - ");
			System.out.print(item + "\n");
    		    		
    	}
    }
}
