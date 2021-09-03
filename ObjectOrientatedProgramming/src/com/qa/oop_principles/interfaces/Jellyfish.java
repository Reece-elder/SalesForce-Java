package com.qa.oop_principles.interfaces;

public class Jellyfish implements Swim, Sleep, Sting{
	
	private String name;

	@Override
	public void sting() {
		System.out.println("Owwwwww");
		
	}

	@Override
	public void sleep() {
		System.out.println("not sure if it sleeps or not..");
		
	}

	@Override
	public void swim() {
		System.out.println("Floats across the tank..");
		
	}

	public Jellyfish(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
