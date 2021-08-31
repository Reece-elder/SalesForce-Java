package iteration.qa;

public class PizzaLoop {
	
	// Create a loop that starts with 8, subtracts by 1 
	// and when there are 2 slices left it systemouts "another slice"
	
	public static void sliceLoop() {
		
		for (int slice = 8; slice >= 0; slice--) {
			
			if(slice <= 2) {
				System.out.println("Time to get another pizza");
			}
			
			System.out.println("Another slice eaten!");
			System.out.println("There are "+ slice + " slices of pizza left");
			
		}
		
	}
	
	// Create a parent loop for pizzas, when slices gets to 0, start on the new pizza
	
	public static void pizzaLoop() {
		
		for (int pizza = 4; pizza >= 0; pizza--) {
			
			if(pizza <= 1) {
				System.out.println("Only one pizza left :(");
			}
			
			for (int slice = 8; slice >= 0; slice--) {
				
				if(slice <= 2) {
					System.out.println("Time to get another pizza");
				}
				
				System.out.println("Another slice eaten!");
				System.out.println("There are "+ slice + " slices of pizza left");
				
			}
			
			System.out.println("One Pizza eaten, there are " + pizza + " pizzas left");
			
		}
		
	}

}
