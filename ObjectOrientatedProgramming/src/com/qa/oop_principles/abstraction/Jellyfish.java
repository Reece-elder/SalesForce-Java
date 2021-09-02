package com.qa.oop_principles.abstraction;

// Jellyfish class is INHERITING the members from Fish ABSTRACT class
public class Jellyfish extends Fish {
	
	// Fields
	public int tentacles; 
	public boolean stingy;

	// Purpose of @Override is to let the developer know, the method has been overridden
	@Override
	public void noise() {
		System.out.println("bob bob bob *bubbles*");
	}

	
	// Creating a constructor
	
	public Jellyfish(int tentacles, boolean stingy) {
		super();
		this.tentacles = tentacles;
		this.stingy = stingy;
	}
	

}
