package arrayOfCharacter;
		// reverse printing
public class App2 {
	public static void main(String[] args) {
		
		String str = "Humpty Dumpty sat on the wall";
		
		char charArray[] = new char[30];
		
		System.out.println(str);
		
		str.getChars(0, 29, charArray, 0);
		
		for (int i=29; i>=0; i--) {
			System.out.print(charArray[i]);
		}
		System.out.println();
		for (int i=0; i<charArray.length; i++) {
		System.out.print(charArray[i]);
		
		}
		System.out.println();
		for( int i=29; i>=0; i--) {
			System.out.print(charArray[i]);
		}
	}

}
