package com.example.jse.m02.s12.ex;

//import java.util.Arrays;

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
    	System.out.print("-------------------------------------------\n");
    	System.out.print("|                                         |\n");
    	System.out.print("| This is args: ");
    	
    	for(String item : args) {
			System.out.print(item + " ");
    	}
    	System.out.print("      |\n");
    	System.out.print("|                                         |\n");
    	System.out.print("|                                         |\n");
    	System.out.print("| This is the requested output:           |\n");
    	System.out.print("|                                         |\n");
    	int i = 0;
    	for(String item : args) {
    		if(i < 3) {
    			System.out.print("| - ");
    			if(i !=1) {
    				System.out.print(item + "                                  |\n");
    			} else {
    				System.out.print(item + "                                    |\n");
    			}
        	    
    		} else {
    			break;
    		}
    		i++;
    	}
    	System.out.print("-------------------------------------------\n");
    }
}
