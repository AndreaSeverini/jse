package com.example.jse.m02.s12.ex;

import java.util.Arrays;

public class Exercise2 {
    public static void main(String[] args) {
        boolean[] flags = { true, false, false };
        System.out.println(Arrays.toString(flags));

        for (int i = 0; i < flags.length-1; i++) {
        	flags [i] = !flags[i];
        }
        System.out.println(Arrays.toString(flags));
    }
}
