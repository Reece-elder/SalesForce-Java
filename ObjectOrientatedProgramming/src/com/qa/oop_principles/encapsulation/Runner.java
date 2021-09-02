package com.qa.oop_principles.encapsulation;

public class Runner {
	
	public static void main(String[] args) {
		
		Fish goldFish = new Fish("Gold", "small fish", 4, 5, 3, true);
		System.out.println(goldFish.getColour());
		
		// Set the colour of gold fish to be maroon
		goldFish.setColour("Maroon");
		System.out.println(goldFish.getColour());
		
		// If I wanted to specify colour CANNOT be blue, can be done with setter
		goldFish.setColour("blue");
		System.out.println(goldFish.getColour());
		
		goldFish.setSize(-3);
		
		// Exercise - Make the variables in your class private
		// Generate getters and setters for your class
		// Add atleast 1 requirement IF statement to one setter
		// Test getting and setting the variables
		
	}

}
;