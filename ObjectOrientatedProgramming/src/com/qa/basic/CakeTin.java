package com.qa.basic;

public class CakeTin {
	
	// A class is JUST a blueprint of instructions 
	// Objects created FROM the cakeTin ARE objects (they are physical and usable)
	
	// Create the fields / variables that make up the cake object
	// A collection of data types to explain what makes up the records
	
	public String colour;
	public String flavour;
	public int layers;
	public int numberOfCandles;
	public boolean sprinkles;
	
	// Static variable shared across all objects
	public static int width = 12;
	public static int cakesMade = 0;
	
	// Create a method that will be accessible to all objects of this class
	// static methods are used when the method relates to the CLASS 
	// This method relates to the OBJECT and so isn't static
	public void cutInSlices() {
		
		// For loop to print out a "Slice has been cut" 8 times
		
		for (int i = 0; i <= 8; i++) {
			System.out.println("A slice has been cut!");
		}
		
		System.out.println("No more cake left :( ");
		
	}
	
	// A way of CREATING the object from this class
	// We use a CONSTRUCTOR to create an object from a class
	// A method WITH NO RETURN with the same name as the class
	
	public CakeTin() {
		
		// When creating a Cake out of the cake tin we need to assign values
		// How do we create other cakes that don't have these values? 
		
		this.colour = "Red";
		this.flavour = "Vanilla";
		this.layers = 3;
		this.numberOfCandles = 0;
		this.sprinkles = true;
		
	}
	
	// Overloading, allows you to create multiple constructors with the same name
	// The difference is what the method takes in
	// Depending on whether you pass in a value or not, chooses the constructor
	
	public CakeTin(String newColour) {
		
		this.colour = newColour;
		this.flavour = "Vanilla";
		this.layers = 5;
		this.numberOfCandles = 0;
		this.sprinkles = true;
		
	}
	
	// Source
	// Right Click > Source > Generate Constructor Using Fields OR SHIFT ALT S 
	
	/**
	 * @param colour
	 * @param flavour
	 * @param layers
	 * @param numberOfCandles
	 * @param sprinkles
	 */
	public CakeTin(String colour, String flavour, int layers, int numberOfCandles, boolean sprinkles) {
		super();
		this.colour = colour;
		this.flavour = flavour;
		this.layers = layers;
		this.numberOfCandles = numberOfCandles;
		this.sprinkles = sprinkles;
		
		cakesMade++;
	}
	
	
	
	// Class Members
	// Class members are the variables or methods WITHIN a class - Something you can access within the class
	// When Creating an object of a class, by default all objects have a COPY of the class members

}
