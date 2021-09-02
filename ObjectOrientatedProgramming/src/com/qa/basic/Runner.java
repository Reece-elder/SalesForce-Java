package com.qa.basic;

public class Runner {
	
	public static void main(String[] args) {
		
		// String is a complex object
		String newString = "This is new";
		
		// Objects are complex objects
		// CakeTin is the data type
		// newCake is the name of the new object
		// new CakeTin() is running the method (Creating a new cake)
//		CakeTin newCake = new CakeTin();
//		CakeTin newerCake = new CakeTin("green");
//		System.out.println(newCake);
//		System.out.println(newCake.flavour);
//		System.out.println(newCake.sprinkles);
//		
//		System.out.println(newerCake.colour);
//		
//		newCake.cutInSlices();
		
		// Exercise - 
		// Create a class of whatever you want and give it atleast 4 variables and 1 method (that system outs something)
		// Trees, dogs, cars, computers, pizzas, people etc.
		// With the constructor, hard code in values
		// Create 1 object out of the class
		// System out the variables and run the method
		
		CakeTin cake1 = new CakeTin("Brown", "Chocolate", 1, 25, true);
		CakeTin cake2 = new CakeTin("Pink", "Jam", 4, 12, true);
		cake1.cutInSlices();
		System.out.println(cake1.colour);
		System.out.println(cake2.colour);
		
		cake1.colour = "Purple";
		System.out.println(cake1.colour);
		System.out.println(cake2.colour);
		System.out.println(CakeTin.width);
		System.out.println(cake2.width);
		
		CakeTin.width = 15;
		System.out.println(cake2.width);
		cake1.width = 17;
		System.out.println(cake2.width);
		System.out.println(CakeTin.cakesMade);
		
		CakeTin cake3 = new CakeTin("Brown", "Chocolate", 1, 25, true);
		CakeTin cake4 = new CakeTin("Pink", "Jam", 4, 12, true);
		System.out.println(CakeTin.cakesMade);
		
		// Exercise -
		// Use the generate constructor to create a new constructor with your fields
		// Add a static variable AND a static method to your class
		// See how changing the value of the static variable (From the runner) changes the value across all objects
		
//		CakeTin.cutInSlices();
		cake1.cutInSlices();
		
		CakeTin.cookCake();
		cake1.cookCake();
		
		
	}

}
