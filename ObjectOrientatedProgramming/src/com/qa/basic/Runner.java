package com.qa.basic;

public class Runner {
	
	public static void main(String[] args) {
		
		// String is a complex object
		String newString = "This is new";
		
		// Objects are complex objects
		// CakeTin is the data type
		// newCake is the name of the new object
		// new CakeTin() is running the method (Creating a new cake)
		CakeTin newCake = new CakeTin();
		CakeTin newerCake = new CakeTin("green");
		System.out.println(newCake);
		System.out.println(newCake.flavour);
		System.out.println(newCake.sprinkles);
		
		System.out.println(newerCake.colour);
		
		newCake.cutInSlices();
		
		// Exercise - 
		// Create a class of whatever you want and give it atleast 4 variables and 1 method (that system outs something)
		// Trees, dogs, cars, computers, pizzas, people etc.
		// With the constructor, hard code in values
		// Create 1 object out of the class
		// System out the variables and run the method
		
	}

}
