package arrays1;

		// Finding max value

public class Lesson4 {
public static void main(String[] args) {
		
		double grades [] = {96.6, 94.3, 89.65, 92.5, 95.45, 99.5, 99.9, 88.32};
		double max;
		
		max = grades[0];
		
		for (int i=0; i<grades.length; i++) {
			
			if (grades[i] > max) max = grades[i];
		}
		System.out.println("the max grades in the class is: "+ max);
		
}
}


		

