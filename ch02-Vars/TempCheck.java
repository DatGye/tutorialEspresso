/*
	Checks and reports the temperatures of two tanks.
	
	This code is under public domain rights and does not require licensing.
*/

class TempCheck {
	
	public static void main (String[] args) {
		
		int temp_a = 54, temp_b = 62;
		int thr_low = 45, thr_high = 65;
		
		System.out.println("Tank A Temperature (F): " + temp_a);
		System.out.println("Tank B Temperature (F): " + temp_b);
		System.out.println();
		
		if ((temp_a >= thr_low) & (temp_a <= thr_high) & (temp_b >= thr_low) & (temp_b <= thr_high)) {
			System.out.println("Both tanks are running at healthy temp range.");
		} else {
			if (temp_a < thr_low) {
				System.out.println("Tank A is experiencing low temperature levels.");
			}
			if (temp_a > thr_high) {
				System.out.println("Tank A is experiencing high temperature levels.");
			}
			if (temp_b < thr_low) {
				System.out.println("Tank B is experiencing low temperature levels.");
			}
			if (temp_b > thr_high) {
				System.out.println("Tank B is experiencing high temperature levels.");
			}
		}
	}
	
}