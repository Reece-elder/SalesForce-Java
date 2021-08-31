package helloWorld.main;

public class FlowControl {
	
	// Order in which code is executed in java (or any language) 
	// Starts from main then goes top to bottom (from main) 
	
//	public static void main(String[] args) {
//		flowExample();
//		third();
//		first();
//		second();
//	}
	
	public static void first() {
		System.out.println("1");
	}
	
	public static void second() {
		System.out.println("2");
	}
	
	public static void third() {
		System.out.println("3");
	}
	
	public static void flowExample() {
		second();
		first();
	}
	
	
	
	

}
