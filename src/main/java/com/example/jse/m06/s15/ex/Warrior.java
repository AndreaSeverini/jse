package com.example.jse.m06.s15.ex;

public class Warrior extends Actor{
	
	public Warrior(String name) {
        super(name);
    }
	
	@Override
	public boolean fight(Actor enemy) {
		
		enemy.setLiving(false);
	
		return false;
	}

	
	

}
