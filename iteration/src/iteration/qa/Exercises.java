package iteration.qa;

public class Exercises {
	
	public static void flowchartB() {
		
		for(int a = 100; a <= 200; a++) {
//			System.out.println(a);
			
			if(a % 2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
		}
		
	}
	
	public static void numbersBasic(int number) {
		
		// We need to seperate the 10s and the 1's from a number
		// We can separate the 10's by dividing by 10
		// Using modulus we can get the remainder (the 1's)
		
		int tensDigit = number / 10;
		System.out.println(tensDigit);
		
		int onesDigit = number % 10;
		System.out.println(onesDigit);
		
		int total = tensDigit + onesDigit;
		System.out.println(total);
		
		
		
	}

}
