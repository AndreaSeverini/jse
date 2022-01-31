/*
 * A simple Java source file

 */
//Questo punta alla directory, astrazione Java di un folder
package com.example.jse.m01.s02;

//import serve per importare altre classi che non si trovano nel package correnti
// import java.lang.Math; // java.lang implicitly imported

/**
 * A "hello" class
 * 
 * @author Emanuele Galli
 */
//Class è l'entità base di Java. Tutto il codice deve essere contenuto in una classe
//Ci deve essere tassativamente una classe che si chiama come il nome del file
public class Simple {
	//Main è la classe standard per far partire il programma
	//String[] array di stringhe è un parametro
    public static void main(String[] args) {
        // output a string to console
    	//invocando metodo print con argomento "Hello, "
        System.out.print("Hello, ");

        // a different input argument leads to a different output
        if (args.length == 1) {
            System.out.println(args[0]);
        }
        System.out.println(Math.PI);
    }
}

class PackageClass {
    // TODO: Not implemented (yet)
}
