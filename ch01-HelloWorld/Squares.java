/*
	(End of Chapter: CODE) Creates a chart of numbers squared.
	
	This code is under public domain rights and does not require licensing.
*/

public class Squares {
	
	public static void main (String[] args) {
		
		int amount, space;
		amount = 32;  // The total amount of squares to display.
		space = 8;    // The amount of squares per grouping.
		
		System.out.println();
		
		for (int x = 1; x <= amount; x++) {
			System.out.println("The square of " + x + " is " + (x * x) );
			
			if (x % space == 0) {
				System.out.println();
			}
		}
		
	}
	
}