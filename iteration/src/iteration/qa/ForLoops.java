package iteration.qa;

public class ForLoops {
	
	// While + Do While loops
	// Primarily work with boolean, it either is or isn't
	// Not as useful for when you want something to run x times, 
	// Better for when you want to switch something on or off
	
	// For loops, do a thing x times then stops after the xth iteration
	// Primarily working with integers and numerical values
	
	public static void forLoop() {
		
		// For loops have three components to consider
		// Initialisation (Initial value)
		// Condition (What it checks for)
		// Iterator (How the value changes)
		
		
//		for(int i = 0; // Initialisation
//				i < 10; // Condition
//				i++; // Add 1 to i){
		
		// Do the code within the for block 10 times
		// i starts at 0, do the code then add 1 to i
		// If i ever goes above 10 stop doing the code
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		// Print out the values from 10 - 1 going in descending order
		
		for (int x = 10; x >= 1; x--) {
			System.out.println(x);
		}
		
		// Print out the values from 10 - 30 in ascending, counting in 2's
				
		for (int j = 10; j <= 30; j+=2) {
			System.out.println(j);
		}
	}
	
	public static void betterForLoop() {
		
		// For loop that starts from x, goes up to y and counts in values z
		
		int x = 4;
		int y = 32;
		int z = 3;
		
		for (int i = x; i <= y; i-=z) {
			System.out.println(i);
		}
		
	}
	
	// When running this method pass in 3 ints (x, y and z)
	// The ints you pass in will be substituted for the variables below
	public static void evenBetterForLoop(int x, int y, int z) {
		
		for (int i = x; i <= y; i +=z) {
			System.out.println(i);
		}
		
	}
	
	public static void helloWorld(String name) {
		System.out.println("Hello " + name);
	}
	
//	Exercise - Using a For Loop that starts with 8 and subtracts 1 each time
//	Logs out "1 pizza slice eaten, there are x slices left"
// 	When there are only 2 slices left, loop carries on but prints out "time to get another pizza"

}
