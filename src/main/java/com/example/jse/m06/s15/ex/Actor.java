package com.example.jse.m06.s15.ex;
import java.util.Random;

public abstract class Actor {
	
	Random r = new Random();
	private String name;
	private int skill;
	private boolean isLiving = true;

    

	protected Actor(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public boolean isLiving() {
		return isLiving;
	}

	public void setLiving(boolean isLiving) {
		this.isLiving = isLiving;
	}
	
//	public boolean figthDragon(Dragon dragon, Actor[] actors) {
//		int luckyActor;
//		int total_skill=0;
//		for (Actor aux : actors) {
//			if (aux.isLiving()) {
//				total_skill += aux.getSkill();
//			}
//		}
//		if (dragon.skill >= total_skill) {
//			System.out.println("All actors burned");
//			for (Actor aux : actors) {
//				aux.setLiving(false);
//			}
//			return false;
//
//		} else {
//			System.out.println(dragon.name + " is dead.");
//			luckyActor=r.nextInt(actors.length);
//			actors[luckyActor].setSkill(actors[luckyActor].getSkill()+10);
//			System.out.println(actors[luckyActor]+ "eats Dragon's heart.");
//			System.out.println("He gains 10 power points.");
//			return true;
//		}
//		
//		
//	}

	public abstract boolean fight(Actor enemy);

	@Override
	public String toString() {
		return "Actor [name=" + name + "]";
	}

	public int getSkill() {
		return skill;
	}

	public void setSkill(int skill) {
		this.skill = skill;
	}
	
	
	
}
