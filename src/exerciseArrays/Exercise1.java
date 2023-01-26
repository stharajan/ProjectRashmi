package exerciseArrays;

public class Exercise1 {
	public static void main(String[] args) {
		
		int yearsMarried[]= new int[5];
		
		yearsMarried[0] = 4;
		yearsMarried[1] = 3;
		yearsMarried[2] = 10;
		yearsMarried[3] = 12;
		yearsMarried[4] = 6;
		
		int family[] = new int[6];
		
		for (int i=0; i<5; i++) {
			//System.out.println("Family "+ i + " has been married for: " + yearsMarried[i] + " years.");
			
		}
		for (int j=0; j<6; j++) {
			family[j] = j+1;
			System.out.println("Family "+ family[j] + " has been married for: " + yearsMarried[j] + " years.");
		}
	}
		
		
		
		

}
