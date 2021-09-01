package arrays.qa;

import java.util.ArrayList;

public class ArrayLists {
	
	// Downsides of Arrays
	// Arrays are immutable, that means the length of the array 
	// or the value of the array (not the value of the elements within) cannot be changed
	// Not as much functionality as other methods
	// Not as simple to read all of the data from an array 
	
	// ArrayLists - A type of collection in Java (Random()) 
	// Make our Arrays resizable and gives us extra functionality to work with
	
	public static void arrayListsDemo() {
		
		// Creating an array of pizza types
		String[] pizzaArray = new String[5];
		
		// Create an array list for types of pizza 
		ArrayList<String> pizzaList = new ArrayList<>();
		
		// Array list methods
		
		// add - Add something to the arraylist
		pizzaList.add("Pepperoni");
		pizzaList.add("Veggie");
		pizzaList.add("Four Cheese");
		System.out.println(pizzaList);
		
		// get - Gets some data from the arraylist
		System.out.println(pizzaList.get(1));
		String retrievedPizza = pizzaList.get(2);
		System.out.println(retrievedPizza);
		
		// set - Updating / replacing something in the array list
		pizzaList.set(0, "Pepperoni Passion");
		System.out.println(pizzaList.get(0));
		
		// remove - removes something from the array list
		pizzaList.remove(1);
		System.out.println(pizzaList);
		
		// size - returns the size / length of the array list
		System.out.println("Before adding pizzas " + pizzaList.size());
		pizzaList.add("Pepperoni");
		pizzaList.add("Veggie");
		pizzaList.add("Four Cheese");
		System.out.println("After adding pizzas " + pizzaList.size());
		
		
		// For each Works EXACTLY THE SAME
		for(String pizza : pizzaList) {
			System.out.println(pizza);
		}

		
		// clear - clears all data from the array list
		System.out.println("Before the clear " + pizzaList);
		pizzaList.clear();
		System.out.println("After the clear " + pizzaList);
		
	}
	
	

}
