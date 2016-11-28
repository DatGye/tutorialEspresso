/*
	Code cracker that goes through many letter combinations.
	
	This code is under public domain rights and does not require licensing.
*/

class CharBreaker {
	
	public static void main (String[] args) {
		
		for (int a = 0; a < 26; a++) {
			for (int b = 0; b < 26; b++) {
				for (int c = 0; c < 26; c++) {
					for (int d = 0; d < 26; d++) {
						System.out.print((char)(a + 97));
						System.out.print((char)(b + 97));
						System.out.print((char)(c + 97));
						System.out.print((char)(d + 97));
						System.out.print(", ");
					}
				}
			}
		}
		
	}
	
}