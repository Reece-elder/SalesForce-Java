package helloWorld.main;

import java.util.Random;

public class DiceRoller {
	
//	public static void main(String[] args) {
//		
//		System.out.println(diceManager());
//		
//	}
	
	public static int diceManager() {
		
		int total = 0; 
		total += sixSided();
		total += sixSided();
		total += sixSided();
		total += sixSided();
		return total;
		
		
	}
	
	public static int sixSided() {
		
		int roll = new Random().nextInt(6);
		roll += 1; // Change a 0 to a 1 (and 1 to 2..)
		
		return roll;
		
	}

}
