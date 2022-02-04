package com.example.jse.m06.s15.ex;
import java.util.Random;

/**
 * Create a hierarchy of classes based on Actor
 * <p>
 * Warrior: could fight, can't do any magic
 * <p>
 * Wizard: can't fight, could do magic
 * 
 * <p>
 * In the main
 * <p>
 * Create a bunch of actors
 * <p>
 * Let them fight against each others
 * <p>
 * Peer-to-peer fight, the most skilled one wins
 * <p>
 * Wizards always beat warriors
 * <p>
 * In the end, let the user knows who survived
 */
public class Main {
	public static void main(String[] args) {

		final int BASE_WARRIOR_SKILL = 100;
		final int BASE_WIZARD_SKILL = 200;
		int total_skill = 0;
		Random r = new Random();
		// TODO: create actors, both warriors and wizards
		Actor[] actors = { new Warrior("Giovanni"), new Wizard("Giacomo"), new Wizard("Aldo") };

		for (Actor actor : actors) {
			System.out.println(actor);
		}

		for (Actor actor : actors) {
			if (actor instanceof Warrior) {
				actor.setSkill(BASE_WARRIOR_SKILL);

			}
			if (actor instanceof Wizard) {
				actor.setSkill(BASE_WIZARD_SKILL);

			}
		}
		System.out.println("Let's fight ...");
		for (Actor actor : actors) {
			int luckyActor;
			if (Math.random() > 0.5 && actor.isLiving()) {
				
				Dragon dragon = new Dragon("Smaug", 400);
				System.out.println("A Dragon named " + dragon.name + " appears!! It has " + dragon.skill + " power.");
				for (Actor aux : actors) {
					if (aux.isLiving()) {
						total_skill += aux.getSkill();
					}
				}
				System.out.println("All actors together gain a total power of " + total_skill + ".");
				System.out.println("LET'S FIGHT AGAINST " + dragon.name + " TOGETHER!");

				if (dragon.skill >= total_skill) {
					System.out.println("All actors burned");
					for (Actor aux : actors) {
						aux.setLiving(false);
					}

				} else {
					System.out.println(dragon.name + " is dead.");
					luckyActor=r.nextInt(actors.length);
					actors[luckyActor].setSkill(actors[luckyActor].getSkill()+10);
					System.out.println(actors[luckyActor]+ "eats Dragon's heart.");
					System.out.println("He gains 10 power points.");
				}

			}
			if (actor.isLiving()) {
				for (Actor enemy : actors) {
					if (!enemy.equals(actor) && enemy.isLiving() && actor.isLiving()) {
						System.out.println(actor +" ("+actor.getSkill()+")"+ " is fighting against: " + enemy+" ("+enemy.getSkill()+")");
						if (actor.getSkill() >= enemy.getSkill()) {
							if (actor.getSkill() == enemy.getSkill()) {
								System.out.println("The fight is ended with no winner.");
							} else {
								actor.fight(enemy);
								System.out.println(enemy + "is dead.");
							}

						} else {
							actor.fight(actor);
							System.out.println(actor + "is dead.");
							
						}

					}
				}

			} else {
				System.out.println(actor + " cannot fight. He is Dead.");
			}
		}
		int thereIsASurvivor=0;
		for(Actor actor:actors) {
			if(actor.isLiving()) {
				System.out.print(actor.getName()+", ");
				thereIsASurvivor++;
			}
		}
		if(thereIsASurvivor>0 && thereIsASurvivor<2) {
			System.out.print("is survived.");			
		}
		if(thereIsASurvivor>1) {
			System.out.print("are survived.");			
		}

	}
}
