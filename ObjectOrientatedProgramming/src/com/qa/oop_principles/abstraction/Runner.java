package com.qa.oop_principles.abstraction;

public class Runner {
	
	public static void main(String[] args) {
		Jellyfish newJelly = new Jellyfish(7, true);
		
		newJelly.noise();
		newJelly.swim();
	}
	
	// Exercise - Using a new Animal class, create your parent class as an abstract class
	// - Give this abstract class 2 abstract methods AND 1 regular method
	// - Make 2 new specific class(s) extend the abstract, implement the abstract methods
	// - Construct the new object(s) with new methods

}
