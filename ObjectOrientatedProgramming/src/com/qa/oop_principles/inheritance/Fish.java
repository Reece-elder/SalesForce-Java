package com.qa.oop_principles.inheritance;

public class Fish {
	
	// Inheritance - Any classes can acquire ALL non-private properties of another class
	// This is done through EXTENDING the orifical class, and can be done for variables AND methods
	
	// Main purpose of this - To use something to base off of, but needing to add more specific info
	
	// Boolean variable (Breathes Oxygen) set to false
	public boolean breathesOxygen = false;
	
	// Basic method which returns the noise of the fish
	public String noise() {
		return "Glub Glub";
	}
	
	

}
