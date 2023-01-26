package arrays1;

/* essentially  an Array is when you have lots of similar type of data and you want to store them
 *  all in one place and under one name.
 */


public class Lesson1 {
	public static void main(String[] args) {
		int ages[] = new int[5];
		double heights[] = new double[5];
		
		ages[0]= 7;
		ages[1]= 6;
		ages[2]= 3;
		ages[3]= 2;
		ages[4]= 5;
		
		
		heights[0] = 4.23;
		heights[1] = 2.34;
		heights[2] = 2.10;
		heights[3] = 3.54;
		heights[4] = 4.50;
		
		System.out.println("second child age is: " + ages[1]);
		System.out.println("\n");
		
		for (int i=0; i<ages.length; i++) {
			System.out.println(ages[i]);
		}
		
		System.out.println("first child height is: "+ heights[0]);
		
		for (double ht: heights) {
			System.out.println(ht);
		}
		
			
	}
	
}
		
		
		

