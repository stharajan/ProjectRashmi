package arrays1;

		// Finding Square root of elements in array of 100 elements.

public class Lesson5 {
	public static void main(String[] args) {
		
		int squareRoot [] = new int [100];
		
		
		for (int i=0; i<squareRoot.length; i++) {
			
			squareRoot[i] = i*i;
			
			System.out.println("Square of: " + i + " is: " + squareRoot[i] );
		}
	}
	

}
