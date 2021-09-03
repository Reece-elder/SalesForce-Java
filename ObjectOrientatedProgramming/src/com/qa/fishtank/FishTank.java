package com.qa.fishtank;

import java.util.ArrayList;

// Role of this class is to create an arraylist for the objects
// Include all of the methods for managing and viewing our objects

public class FishTank {
	
	// Make an array list of the object GoldFish
	ArrayList<GoldFish> fishTank = new ArrayList<>();
	
	// Method to add a GoldFish to our fish tank
	// Take in a GoldFish (fish) and use the arraylist methods to add this object to the list
	public void addToTank(GoldFish fish) {
		fishTank.add(fish);
		System.out.println(fish.getName() + " has been added to the tank :) ");
	}
	
	// Create a method to output all of the names of all of the fish
	// Creating an enhanced for loop / for each loop for the array
	// For each Goldfish in the array output the name
	public void listNames() {
		for(GoldFish fish : fishTank) {
			System.out.println(fish.getName());
		}
	}

}
