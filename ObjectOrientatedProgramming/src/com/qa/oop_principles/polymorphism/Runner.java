package com.qa.oop_principles.polymorphism;

public class Runner {
	
	// Polymorphism - Objects belong to other objects in the chain
	// Poly  - Many of
	// Morph - Objects
	// NOT the idea that EVERYTHING is an object
	// The idea that all OBJECTS in java are objects of something else of something else.. etc..
	
	// goldy is a GoldFish
	// goldy is a Fish
	// goldy is an Object 

	// All objects created within Java are PolyMorphic because they are atleast 2 objects
	
	public static void main(String[] args) {
		
		// Goldy is a GoldFish!
		GoldFish goldy = new GoldFish("Golden", 3);
		goldy.noise();
		
		// goldy2 is a Fish!
		Fish goldy2 = new GoldFish("Sunset Orange", 2);
		((GoldFish) goldy2).noise();
		
		// goldy3 is an Object
		Object goldy3 = new GoldFish("Maroon", 4);
		((GoldFish) goldy3).noise();
		
		// The GOldfish class / object IS polymorphic because it can take on many different objects
		
	}
	

}
