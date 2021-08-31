package helloWorld.main;

import java.util.Random;

public class CallStack {
	
	// Call Stack - The order in which new methods run and when new methods terminate
	
//	public static void main(String[] args) {
//		
//		System.out.println("Hello im the main!");
//		firstLayer();
//		System.out.println("Main is finished");
//		
//	}
	
	// This method will be called by main 
	public static void firstLayer() {
		
		int total = 5;
		total += secondLayer();
		System.out.println("final total: " + total);
		
//		System.out.println("Hello im the first layer!");
//		secondLayer();
//		System.out.println("First Layer is finished");
		
	}
	
	public static int secondLayer() {
		
		int addValue = new Random().nextInt(6);
		System.out.println(addValue);
		
		return addValue;
		
		// Ctrl Shift O - Sorts out your imports
		
//		tertiaryLayer();
	}
	
//	Ctrl / - comments out everything (you've highlighted)
	
//	public static void tertiaryLayer() {
//		System.out.println("Look at me, im the third!");
//	}

}
