package com.qa.oop_principles.abstraction;

// Specify the class as abstract

public abstract class Fish {
	
	// Abstraction 
	// Hiding details between modules, only sharing functionality if need be
	// Not all things should be visible to everything
	
	// Use the Abstract key word, this means it makes a class abstracted, and no longer able to create objects
	
	// Abstractions - Plans and designs to create moulds
	// Classes 		- Instructions / Moulds
	// Objects 		- Physical instances of the moulds
	
	
	// Only things that can be abstract are METHODS
	
	// Make an abstract method
	// Abstract method called noise();
	// Abstract methods have no body, doesn't do anything
	public abstract void noise(); 
	
	// Is a regular method NOT ABSTRACT
	// Has a body and does something
	public void swim() {
		System.out.println("Swims through the tank");
	}
	
}
