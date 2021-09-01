package iteration.qa;

public class Recap {
	
	// While Loops
	// Loops that primarily use a boolean condition to check
	// The loop either runs or it doesn't
	// Must add your own code / method to change the boolean to stop the loop
	
	public static void whileLoop() {
		
		int counter = 0;
		boolean counterMax = true;
		
//		while(counterMax == true)
		while(counter < 5) {
//			System.out.println("Current count value: " + counter);
			counter++;
			System.out.println("Current count value: " + counter);
		}
		
	}
	
	
	// Do While Loops
	// Do While loops ALWAYS run code once before the condition is checked
	
	public static void doWhileLoop() {
		
		int counter = 10;
		
		do {
			counter--;
			System.out.println("Current counter value: " + counter);
		} while (counter > 0);
		
	}
	
	// For Loops
	// Primarily works with numerical / lists of data
	// Loop runs for a max length, rather than it either being on or off
	
	public static void forLoop() {
		
		// Initialisation
		// Condition
		// Iterator
		
		// Create a loop that prints out Hello Reece 10 times
		
		for(int i = 0; i <= 10; i++) {
			System.out.println("Hello Reece!");
		}
		
	}
	
	// Switch Case

}
