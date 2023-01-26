package arrays1;

public class Lesson3 {
	public static void main(String[] args) {
		
		double grades [] = {96.6, 94.3, 89.65, 92.5, 95.45, 88.32};
		int numbers [] = new int[10];
		
		for (int i=0; i<grades.length; i++) {
			
			System.out.println("grade number "+ i+ " is "+ grades[i]);
		}
		
		for (int i=0; i<10; i++) {
			numbers[i] = i + 1;
		}
		for ( int i=0; i<10; i++) {
			System.out.println(numbers[i]);
			
		}
	}

}
