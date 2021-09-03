package com.qa.oop_principles.interfaces;

// Best practice that each interface contains one method
// This way if one class requires two distinct interfaces and not another, you're not adding unnecessary code

public interface Swim {
	
	// if a method is public, any class within the package can access and use it
	// no need for interfaces to be private, because they don't return or do anything
	void swim();

}
