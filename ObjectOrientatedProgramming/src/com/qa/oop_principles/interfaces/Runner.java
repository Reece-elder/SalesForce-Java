package com.qa.oop_principles.interfaces;

public class Runner {
	
	public static void main(String[] args) {
		
		GoldFish goldy = new GoldFish("goldy");
		Jellyfish steven = new Jellyfish("steven");
		
		goldy.noise();
		steven.swim();
		goldy.sleep();
		steven.sleep();
		
		// Exercise - Using an existing / new animal class
		// Create atleast 3 interfaces using existing methods (sleep, swim, eat..) 
		// Implement those interfaces on atleast 2 different animal classes 
		
	}

}
