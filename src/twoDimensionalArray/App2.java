package twoDimensionalArray;

public class App2 {
	public static void main(String[] args) {
		int revenue[][]= new int [12][2];
		revenue[0][0] = 1;
		revenue[1][0] = 2;
		revenue[2][0] = 3;
		revenue[3][0] = 4;
		revenue[4][0] = 5;
		revenue[5][0] = 6;
		revenue[6][0] = 7;
		revenue[7][0] = 8;
		revenue[8][0] = 9;
		revenue[9][0] = 10;
		revenue[10][0] = 11;
		revenue[11][0] = 12;
		
		revenue[0][1] = 1234;
		revenue[1][1] = 1322;
		revenue[2][1] = 1433;
		revenue[3][1] = 4233;
		revenue[4][1] = 2345;
		revenue[5][1] = 3426;
		revenue[6][1] = 2347;
		revenue[7][1] = 4328;
		revenue[8][1] = 2349;
		revenue[9][1] = 4560;
		revenue[10][1] = 5411;
		revenue[11][1] = 5412;
		
		for (int i=0; i<12; i++) { 	// loop of months
			
		System.out.println("for the month of: "+ revenue[i][0]+ " revenue was: "+ revenue[i][1]);
			
		}
		
	}

}
