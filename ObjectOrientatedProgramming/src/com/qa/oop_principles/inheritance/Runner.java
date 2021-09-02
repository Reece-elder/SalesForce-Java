package com.qa.oop_principles.inheritance;

public class Runner {
	
	public static void main(String[] args) {
		
		// To create a goldfish out of goldfish class
		GoldFish newGoldFish = new GoldFish("Orange");
		
		System.out.println(newGoldFish.noise());
		newGoldFish.fishTraits();
		
		// Creating a new dolphin
		Dolphin newDolphin = new Dolphin(true);
		newDolphin.changeBreathing();
		System.out.println(newDolphin.noise());
		
	}

}
