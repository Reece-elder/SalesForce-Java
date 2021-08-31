package iteration.qa;

public class CommandWords {
	
	public static void CommandWordDemo() {
		
		// Command words are used to control more thoroughly the flow within our loops we create
		// They can be used outside of loops as well, but primarily work when iterating through code
		
//		Break - Stops the current loop / code block, takes you out of the current method to the next
//		Continue - Skips the current iteration of the loop, but starts from the next iteration
//		Return - Ends the method, returning what has been specified. 
//		If a loop is within a method, finishes LOOP AND METHOD
		
		
		// Start from 0 up to 20, counting up in 3's
		// if i == 6 skip this iteration (but keep counting)
		// if i == 12 stop the loop completely
		for (int i = 0; i < 20; i+= 3) {
			
			if (i == 6) {
				continue;
			} else if (i == 12) {
				break;
			} else {
				System.out.println(i);
			}
			
		}
		
	}

}
