package com.qa.oop_principles.interfaces;

// Primary class starting with is the more specific type of fish

// Interfaces - A completely abstract class only containing methods with empty bodies
// No need to specify the empty methods as abstract, they're all abstract by default

// Previously to use the abstract class, needed to use EXTEND
// Drawback with abstract classes is you can only EXTEND one class

// With interfaces, use the IMPLEMENTS keyword instead
// With interfaces, multiple interfaces can be implemented at the same time

public class GoldFish implements Fish{
	
	private String name;

	@Override
	public void sleep() {
		System.out.println("Sleeping!");
		
	}

	@Override
	public void noise() {
		System.out.println("Glub Glug Glub");
		
	}

	@Override
	public void swim() {
		System.out.println("Swimming across the tank :) ");
		
	}

	public GoldFish(String name) {
		super();
		this.name = name;
	}

}
