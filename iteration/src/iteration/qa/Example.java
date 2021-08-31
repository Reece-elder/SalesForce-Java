package iteration.qa;

public class Example {
	
	// Iteration is the method of repeating blocks of code until a specific condition is met. 
	// Examples: Dice roller app, roll 5 dice. It'd iterate the code 5 times
	// - Social media with a scrolling functionality will iterate and create
	// a text block for each item in a list
	// - Spotify / Music players will iterate over a list of songs (playlist) 
	
	// Iteration and loops
	
	// There are 3 types of basic loop:
	//	- While
	//	- Do-While
	//	- For
	
	
	// While Loop
	// Uses a boolean to check condition, runs the code UNTIL the condition is met
	

	
	// Using an if statement, when dogs reaches 5 set tooManyDogs true
	// When tooManyDogs = true, stop running the loop
	
	public static void dogCounting() {
		
		int dogs = 0; 
		boolean tooManyDogs = false;
		
		while(tooManyDogs == false) {
			
			if(dogs >= 5) {
				tooManyDogs = true;
			}
			
			System.out.println("number of dogs: " + dogs);
			dogs++; // Adds 1 to dogs
			System.out.println("One dog added, new total: " + dogs);
			
		}
	}
	
	
	// While Loop checks the condition first
	// Then runs the code if condition matches
	
	// Do-While Loop runs the code first REGARDLESS of the condition, then checks the condition
	// Doesnt matter what the condition is, the code will always run once
	
	public static void doWhileLoop() {
		
		int counter = 5;
		boolean counterBoolean = false;
		
		do {
			System.out.println("Current Counter value: " + counter);
			counter--;
			System.out.println(counter);
			
			if(counter < 1) {
				counterBoolean = false;
			}
			
		} while (counterBoolean == true);
	}
	
//	Exercise - Using either while OR do While do the following:
//	- Start with an amount of money (maybe 200..)
//	run a method that subtracts a defined amount of money (30 maybe?) 
//	When the total amount goes under a value (50 maybe?) syso "STOP SPENDING MONEY" and stop the loop
	

}
