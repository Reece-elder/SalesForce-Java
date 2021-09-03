package com.qa.fishtank;

// What I want to achieve: 
// Creating objects out of a class, with some vars and some methods 				 (GoldFish class)
// A class which handles the arraylist and methods 									 (FishTank class)
// A runner which adds data to the array list and runs the methods from the FishTank (Runner Class)

public class GoldFish {
	
	private String colour;
	private String name;
	private int fins;
	private boolean breathesOxygen;
	
	public void makeNoise() {
		System.out.println("*bubble bubble bubble*");
	}

	// Constructor - Create an object of a class
	
	public GoldFish(String colour, String name, int fins, boolean breathesOxygen) {
		super();
		this.colour = colour;
		this.name = name;
		this.fins = fins;
		this.breathesOxygen = breathesOxygen;
	}
	
	// Getters and Setters - Allow you to retrieve and set the variables

	// Get = Read
	public String getColour() {
		return colour;
	}

	// Set = Update
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getFins() {
		return fins;
	}

	public void setFins(int fins) {
		this.fins = fins;
	}

	public boolean isBreathesOxygen() {
		return breathesOxygen;
	}

	public void setBreathesOxygen(boolean breathesOxygen) {
		this.breathesOxygen = breathesOxygen;
	}
}
