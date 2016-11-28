/*
	Computes the time it takes for light to travel a distance.
	
	This code is under public domain rights and does not require licensing.
*/

class LightTime {
	
	public static void main (String[] args) {
		
		double c, d, t;
		c = 299_792_458;  // Constant of the Speed of Light in meters per second [DON'T CHANGE].
		d = 0.02;  // Distance in Meters.
		
		t = d / c;  // Gets the time it takes for light ti travel through distance.
		
		System.out.println("The time it takes for to travel " + d + " meters is " + t + " seconds.");
		
	}
	
}