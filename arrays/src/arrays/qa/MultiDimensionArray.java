package arrays.qa;

public class MultiDimensionArray {
	
	// Previous Arrays covered were single dimension arrays
	// A single axis from 0 - max length with values inbetween
	
	// Multi dimension arrays are more sophisticated with each 'dimension' being a nested array
	// Nested - Contains something
	// Nested Array - Array containing an array as a value / element
	
	public static void multiDimensionDemo() {
		
		// Single Dimension array
		int[] idArray = {1,56,36,78};
		
		// Arrays containing arrays
		// Array of arrays containing 2x ints
		// 2D array, 3x arrays containing 2x values each
		int[][] gridArray = { {24,32}, {17,89}, {83, 62} };
		
		int[][] emptyGridArray = new int[3][2];
		
		// How to system out 89
		System.out.println(gridArray[1][1]);
		
	}
	
	public static void multiDimensionLoop() {
		
		int[][] gridArray = { {24,32,45}, {17,89,47}, {83,62,123} };
		
		// 2D+ arrays can be looped through using nested loops
		
		// gridArray contains arrays of ints and not just ints
		// int [] must be used
		for (int[] parentArray : gridArray) {
			
			// For every integer in the parent array do this
			for(int child : parentArray) {
				System.out.println(child);
			}
		}
	}
}
