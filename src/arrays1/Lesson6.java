package arrays1;

		//Finding Max and Min Values in an Array.

public class Lesson6 {
	public static void main(String[] args) {
		
		int largeArray[] = {29, 35, 8, -34, 15, 2, 34, 52, 42, 47, 63, 99, 109, 24, 78, 86, 51, 63};
		
		int min = largeArray[0];
		int max = largeArray[0];
		
		for(int i=0; i<largeArray.length; i++) {
			
			if(largeArray[i] < min) min = largeArray[i];
			if(largeArray[i] > max) max = largeArray[i];
			
		}
		
		System.out.println("the smallest value in array is: "+ min);
		
		System.out.println("the largest value in array is: "+ max);
		
	}

}
