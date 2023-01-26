package arrayOfCharacter;

public class App {
	public static void main(String[] args) {
		String str = "Jason Gibson";
		
		char array[] = new char[14];
		
		str.getChars(0, 5, array, 0);
		
		System.out.print(array[0]);
		System.out.print(array[1]);
		System.out.print(array[2]);
		System.out.print(array[3]);
		System.out.print(array[4]);
	}

}
