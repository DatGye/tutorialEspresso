/*
	Displays every possible character of the ASCII table.
	
	This code is under public domain rights and does not require licensing.
*/

class ListAscii {
	
	public static void parseBell() {
		System.out.print((char)(7));
	}
	
	public static void main (String[] args) {
		
		for(int i = 0; i < 256; i++) {
			System.out.print((char)(i));
			System.out.print(", ");
		}
		
	}
	
}