/*
	Creates 3 variables that display on screen.
	
	This code is under public domain rights and does not require licensing.
*/

class PunchMemory {
	
	public static void main (String[] args) {
		
		boolean displaySUM = true; // Set true to display Sum of all variables.
		
		// Initiate Variables
		int a = 3;
		int b = 21;
		int c = 8;
		
		// Display Variables
		System.out.println("Variables in memory.");
		System.out.println("");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
		if (displaySUM) {
			System.out.println("SUM = " + (a + b + c) );
		}
		
	}
	
}