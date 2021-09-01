package arrays.qa;

public class BasicUsage {
	
	// Arrays allow us to store many values in a single variable
	// If using ints / bools etc. Only one value can be stored per variable name
	// Arrays are collections of like / similar values, such as lists of colours, names, ages etc. 
	
	// Examples: 
	// Collection of ticket ids
	// list of films
	// List of true or false answers in a survey
	
	// Arrays in Java can only store the same type of datatype (numbers, strings, booleans etc)
	
	// Arrays are immutable, this means the data type AND length of an array cannot change
	// Arrays are like a train, they have a set number of carriages, people / values can come and go
	// But the length or type of train cannot change while in use
	
	
	public static void arrayBasic() {
		
		// When creating an array you must: specify the data type, and the name
		
		// Creating an empty array of Strings called colourArray
		// The [] denote that it is an array
		String[] colourArray = null;
		
		// Create an array of ints called numberArray
		int[] numberArray = null;
		
		System.out.println(colourArray);
		
		// Creating an array with some values
		// Data type and name
		// What values are we plugging in
		
		String[] nameArray = {"Reece", "Kate", "Colin", "Mary", "Jeevan", "Haroon"};
		System.out.println(nameArray);
		
		// All object / complex variables are references to primitive variables
		
		// Use indexing
		// When creating an array all values are assigned an index number
		// Starts from 0 and increases by 1 for each new element
		
//		System.out.println(nameArray[0]);
//		System.out.println(nameArray[1]);
		
		for(int i = 0; i <= 5; i++) {
			System.out.println(nameArray[i]);
		}
		
		
		// Third method of creating an array - Creating an empty array BUT specifying the length
		// Data type and name
		// new <data type> followed by [<length>]
		
		// Empty array of length 4 for true/false answers
		
		boolean[] trueFalseAnswer = new boolean[4];
		System.out.println(trueFalseAnswer);
		System.out.println(trueFalseAnswer[1]);
		
		// Exercise - 
		// Create 4 arrays for the following fields, names, 
		// favColour, favNumber, likesPineappleOnPizza for 5 random people
		// System.out atleast 1 different index from each array
		// Stretch goal - To alter / modify an existing value in an array
		
		
	}
	
	public static void arrayExercise() {
		
		boolean[] likesPineappleOnPizza = {true, true, false, true, true};
		System.out.println(likesPineappleOnPizza[3]);
		likesPineappleOnPizza[3] = false;
		System.out.println(likesPineappleOnPizza[3]);
		
	}
	
	public static void arrayManipulation() {
		
		// Creating an empty array of length 4
		String[] pizzaArray = new String[4];
		
		System.out.println(pizzaArray[2]);
		pizzaArray[2] = "Pepperoni";
		System.out.println(pizzaArray[2]);
		pizzaArray[2] = "Hawaiaan";
		System.out.println(pizzaArray[2]);
		
		// Create an array of random numbers of length 5
		float[] floatArray = {52.45f, 13.63f, 78.96f, 123.45f, 0.78f};
		System.out.println(floatArray[1]);
		floatArray[1] = 5678.85f;
		System.out.println(floatArray[1]);
		
	}
	
	// Exercise - Either doing it manually OR using a for loop, 
	// modify the fav numbers you've got to their squared values
	// favNumber[1] = 9 
	// favNumber[1] = 81

}
