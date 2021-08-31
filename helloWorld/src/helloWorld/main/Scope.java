package helloWorld.main;

public class Scope {
	
	// What level of accessibility do variables / methods have, where and how can they be accessed
	
	// Class Level Scope
	// Variables defined inside a class BUT outside of methods can be used throughout the class
	
	
	// Local Scope
	// Variables defined INSIDE of a method are only used in the method
	// When the method has left the stack, vars declared inside are no longer accessible
	
	
	// Class Level Variable
	
	public static void main(String[] args) {
		System.out.println(numberVar);
		System.out.println(newMethod());
	}
	
	public static int numberVar = 123;
	
	
	// Local Variable
	
	public static int newMethod() {
		
		int newVar = 321;
		return newVar;
		
	}
	
	// S _ C _ R I _ Y
	
	
	public static void creditCard() {
		
		int creditCard_Number = 2302810;
		
	}
	
	public static void bigHacker() {
		
//		System.out.println(creditCard_number);
		
	}
	
	
	
	

}
