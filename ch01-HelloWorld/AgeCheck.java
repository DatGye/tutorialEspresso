/*
	Checks age for accessing mature content.
	
	This code is under public domain rights and does not require licensing.
*/

class AgeCheck {
	
	public static void main (String[] args) {
		
		int age = 17;  // Enter age in years after birth.
		System.out.println("Your age: " + age);
		
		if (age >= 18) {
			System.out.println("You meet our age requirements.");
		} else {
			System.out.println("Sorry, but you do not meet our age requriements.");
		}
		
	}
	
}