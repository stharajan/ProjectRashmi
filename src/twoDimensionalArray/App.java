package twoDimensionalArray;

/* 2	4	8	9
 * 11	15	16	17
 * 22	24	26	-27
 */

public class App {
	public static void main(String[] args) {
		
		int table [][] = new int [3][4];
		
		table[0][0] = 2;
		table[0][1] = 4;
		table[0][2] = 8;
		table[0][3] = 9;
		
		table[1][0] = 11;
		table[1][1] = 15;
		table[1][2] = 16;
		table[1][3] = 17;
		
		table[2][0] = 22;
		table[2][1] = 24;
		table[2][2] = 26;
		table[2][3] = -27;
		
		//System.out.println(table[0][0] +" " + table[0][1]);
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<4; j++) {
				System.out.print(table[i][j]+"\t");
			}
			System.out.println();
		}
		}
	}

		
		
		


