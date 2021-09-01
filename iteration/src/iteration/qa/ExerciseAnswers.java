package iteration.qa;

public class ExerciseAnswers {
	
	public static void flowchartA() {
		
		for(int a = 100; a <= 200; a++) {
			System.out.println(a);
		}
		
	}
	
	public static void flowchartB() {
		
		for(int a = 100; a < 200; a++) {
			
			if(a % 2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
			
		}
		
	}
	
	public static void calcChange(float spent, float price) {

		float change = spent - price;

		int twenties = 0;
		int tenners = 0;
		int fivers = 0;
		int twoPounds = 0;
		int pounds = 0;
		int fiftyPences = 0;
		int twentyPences = 0;
		int tenPences = 0;
		int fivePences = 0;
		int twoPences = 0;
		int onePences = 0;

		while (change >= 20) {
			change -= 20;
			twenties++;
		}
		while (change >= 10) {
			change -= 10;
			tenners++;
		}
		while (change >= 5) {
			change -= 5;
			fivers++;
		}
		while (change >= 2) {
			change -= 2;
			twoPounds++;
		}
		while (change >= 1) {
			change -= 1;
			pounds++;
		}
		while (change >= 0.5) {
			change -= 0.5;
			fiftyPences++;
		}
		while (change >= 0.2) {
			change -= 0.2;
			twentyPences++;
		}
		while (change >= 0.1) {
			change -= 0.1;
			tenPences++;
		}
		while (change >= 0.05) {
			change -= 0.05;
			fivePences++;
		}
		while (change >= 0.02) {
			change -= 0.02;
			twoPences++;
		}
		while (change >= 0.01) {
			change -= 0.01;
			onePences++;
		}

		System.out.println("£20: " + twenties);
		System.out.println("£10: " + tenners);
		System.out.println("£5: " + fivers);
		System.out.println("£2: " + twoPounds);
		System.out.println("£1: " + pounds);
		System.out.println("50p: " + fiftyPences);
		System.out.println("20p: " + twentyPences);
		System.out.println("10p: " + tenPences);
		System.out.println("5p: " + fivePences);
		System.out.println("2p: " + twoPences);
		System.out.println("1p: " + onePences);
	}
	
	public static void numbersBasic(int number) {
		
		int firstDigit = number / 10;
		int secondDigit = number % 10;
		int sum = firstDigit + secondDigit;
		System.out.println(sum);
		
	}
	
	public static void numbersTwo(int number) {
		
		int firstDigit = number / 10;
		int secondDigit = number % 10;
		
		String firstStr = null;
		String secondStr = null;
		
		System.out.println(firstDigit);
		System.out.println(secondDigit);
		
		switch(firstDigit) {
		
		case 1:
			firstStr = "";
		case 2:
			firstStr = "Twenty";
		case 3:
			firstStr = "Thirty";
		case 4:
			firstStr = "Fourty";
		case 5:
			firstStr = "Fifty";
		case 6:
			firstStr = "Sixty";
		case 7:
			firstStr = "Seventy";
		case 8:
			firstStr = "Eighty";
		case 9:
			firstStr = "Ninety";
		case 10:
			firstStr = "test";
			
		}
		
		switch(secondDigit) {
		
		case 1:
			secondStr = "One";
		case 2:
			secondStr = "Two";
		case 3:
			secondStr = "Three";
		case 4:
			secondStr = "Four";
		case 5:
			secondStr = "Five";
		case 6:
			secondStr = "Six";
		case 7:
			secondStr= "Seven";
		case 8:
			secondStr = "Eight";
		case 9:
			secondStr = "Nine";
			
		}
		
		System.out.println(firstStr + "-" + secondStr);
		
	}

}
