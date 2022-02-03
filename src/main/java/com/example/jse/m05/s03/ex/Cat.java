package com.example.jse.m05.s03.ex;

public class Cat {
	//Relativo alla classe gatto, non al singolo gatto
	//conta il numero di gatti a sistema
    private static int count = 0;

    private String name;
    private String color;

    /**
     * Cat with a given name and color
     * 
     * @param name  the cat name
     * @param color the cat color
     */
    public Cat(String name, String color) {
        // TODO: initialize the object
    	this.name = name;
    	this.color = color;
        // TODO: increase the counter
    	count++;
    	System.out.println("A new cat named " + name + " with color " + color + " has been created.");
    	System.out.println("There are " + count + " cat(s).");
    }

    /**
     * @return the number of cats created via ctor
     */
    public static int getCount() {
        return count;
    }

    /**
     * The current cat meow on the console
     */
    public void meow() {
        //: Print name and color to System.out
    	System.out.println("The " + this.color + " cat named " + this.name + " says: 'MEOW!!'");
    }

    /**
     * The current cat meow on the console
     * 
     * @param word to be printed on out console
     */
    public void meow(String word) {
        // Print word, cat name and color to System.out
    	System.out.println("The " + this.color + " cat named " + this.name + " says: '" + word +"'!!");
    }

    @Override
    public String toString() {
        return "Cat [name=" + name + ", color=" + color + "]";
    }

	public String getName() {
		return name;
	}

	
	
    
}
