package com.qa.oop_principles.inheritance;

public class Dolphin extends Fish {
	
	public boolean eatenFish = true;
	
	// Dolphin class is inheriting the breathesOxygen variable
	// Is changing the value to be correct
	public void changeBreathing() {
		System.out.println(breathesOxygen);
		breathesOxygen = true;
		System.out.println(breathesOxygen);
	}

	/**
	 * @param eatenFish
	 */
	public Dolphin(boolean eatenFish) {
		super();
		this.eatenFish = eatenFish;
	}
	
	// Exercise - Using any type of animal as a class
	// Create two variables for that parent class and one method (of something it does)
	// Create two types of that class that add a unique variable and method
	// Create constructors for those classes 
	// Create the objects and system out / run the methods from the objects
	
	

}
