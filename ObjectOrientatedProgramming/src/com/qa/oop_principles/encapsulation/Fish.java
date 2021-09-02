package com.qa.oop_principles.encapsulation;

public class Fish {
	
	// Encapsulation - Data (Variables) should be bundled together with code (methods) that operate on them
	// rather than allowing DIRECT ACESSS
	// Our variables should be PRIVATE and we should create methods that return and set them
	// Using custom methods we can add specifications to our data type
	
	private String colour;
	private String type;
	private int size;
	private int weight;
	private int numberOfFins;
	private boolean edible;
	
	
	/**
	 * @param colour
	 * @param type
	 * @param size
	 * @param weight
	 * @param numberOfFins
	 * @param edible
	 */
	public Fish(String colour, String type, int size, int weight, int numberOfFins, boolean edible) {
		super();
		this.colour = colour;
		this.type = type;
		this.size = size;
		this.weight = weight;
		this.numberOfFins = numberOfFins;
		this.edible = edible;
	}
	
	// Getters and setters - Get data and set data


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		
		if(colour == "blue") {
			System.out.println("Colour not accessible!!");
		} else {
			this.colour = colour;
		}
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		
		if(size <= 0) {
			System.out.println("Size is too small!");
		} else {
			this.size = size;
		}
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	public int getNumberOfFins() {
		return numberOfFins;
	}


	public void setNumberOfFins(int numberOfFins) {
		this.numberOfFins = numberOfFins;
	}


	// Booleans don't GET data, they are data?? 
	public boolean isEdible() {
		return edible;
	}


	public void setEdible(boolean edible) {
		this.edible = edible;
	}
}
