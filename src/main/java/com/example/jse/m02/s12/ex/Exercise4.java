package com.example.jse.m02.s12.ex;

public class Exercise4 {
    public static void main(String[] args) {
        /*
         *
         * 
         * ["ciao", "hello"] -> "ciao" "hello"
         * 
         * ["ciao", "hello", "ciao", "hello"] -> "ciao" "hello", "ciao"
         */
    	//System.out.println(args);
    	//int argLen =args.length;
    	//System.out.print(argLen);
    	int i = 0;
    	for(String item : args) {
    		if(i < 3) {
    			System.out.print(" - ");
    			System.out.print(item + "\n");
        	    
    		} else {
    			break;
    		}
    		i++;
    	}
    }
}
