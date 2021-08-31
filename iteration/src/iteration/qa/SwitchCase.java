package iteration.qa;

public class SwitchCase {
	
	// Switch Case statements allow you to streamline nested if else statements
	// Can be used to iterate through a bunch of scenarios
	
	public static String codeExample() {
		
		String day = "Thursday";
		// If its thursday return "yes"
		
		if(day == "monday") {
			return "yes";
		} else if (day == "tuesday") {
			return "yes";
		} else if (day == "wednesday") {
			return "very tedious tbf";
		} else {
			return "very tedious";
		}
		
	}
	

	
	// Switch Cases are a series of code blocks, 
	// depending on the variable a different code block is ran
	
	public static void switchCaseMethod(String day) {
		
//		String day = "February";
		
		// switch, pass in the variable to check
		switch(day) {
		
		// case, what is the first possible value?, :
		// what code is ran when day == monday
		case "Monday":
			System.out.println("The day is Monday!");
			// Break stops the code there, otherwise if another switch case is true
			// It would run another (infinite loop)
			break;
			
		case "Tuesday":
			System.out.println("The day is Tuesday!");
			break;
			
		case "Wednesday":
			System.out.println("The day is Wednesday!");
			break;
			
		// Runs if none of the other cases match
		// default:
		default:
			System.out.println("not a day of the week :( ");
			
			
		}
		
		
		
		
	}
	

}
