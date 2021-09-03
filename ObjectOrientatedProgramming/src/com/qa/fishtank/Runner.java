package com.qa.fishtank;

// Role of this class is to run the application
// Create some fish, add the fish to the tank

// Ctrl Space brings up all possible code?? 

public class Runner {
	
	public static void main(String[] args) {
		
		// First thing to do within my runner is create a new FishTank object
		FishTank fishTank = new FishTank();
		
		// Fish objects 
		GoldFish fish1 = new GoldFish("Hazy Orange", "Percy", 3, false);
		GoldFish fish2 = new GoldFish("Dull Gold", "Kelly", 4, false);
		GoldFish fish3 = new GoldFish("Maroon", "Maroon 5", 4, false);
		
		// Add fish1 to the tank
		fishTank.addToTank(fish1);
		fishTank.addToTank(fish2);
		fishTank.addToTank(fish3);
		
		// Accessing the fishtank array within the fish tank object
		System.out.println(fishTank.fishTank);
		
		fishTank.listNames();
		
		
		// ==========================================================
		// Exercise - Animal Habitat exercise
		// Create a new animal class (for a specific type of animal) with atleast 4 variables and 1 method
		// Include getters, setters and constructor
		// Create an appropriate habitat class for that animal
		// Habitat class must include the following methods: 
		// - Add to habitat
		// - Remove all animals from habitat
		// - Get one variable from all animals (animal.getName())
		// - Run Method of one animal by specifying one of the variables
		// - Remove an animal from the habitat by specifying one of the variables 
	
		
	}

}
