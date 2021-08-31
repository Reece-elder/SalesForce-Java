package helloWorld.main;

public class dataTypes {
	
	// Data types in Java have two distinct groups 
	
	// Primitives
	// - are single data types and are stored in the memory
	// - int, boolean, float, double, char (single character) such as r 3 i
	
	
	// Objects
	// - Are complex data types with more than one data type stored in them, and are references to primtives
	// - Array, String, any new object
	
	// String - collection of chars 
	// Hello World = H e l l o _ w o r l d 
	
	
	// Returning data types
	// Java is an explicit language, when we're declaring or returning ANYTHING we have to specify 
	// what is the data type of the thing we're expecting to return
	
	
	public static int returnInt() {
		return 123;
	}
	
	public static String returnString() {
		return "Hello!";
	}
	
	public static void noReturn() {
		System.out.println("No return!");
	}
	
	public static boolean boolReturn() {
		return true;
	}
	
	public static float floatReturn() {
		return 14.50f;
	}
	
//	public static NewObject objectReturn() {
//		return NewObject;
//	}
	

}