package arrayOfString;

public class App3 {
	public static void main(String[] args) {
		
		String sen1 [] = {"popeye", "the", "sailor", "man"};
		String sen2 [] = new String[5];
		
			sen2[0] = "here";
			sen2[1] = "I";
			sen2[2] = "come";
			sen2[3] = "to save";
			sen2[4] = "the day";
			
			for(int i=0; i<sen1.length; i++) {
				System.out.print(sen1[i]+" ");
				}
			
			System.out.println();
			for(int j=0; j<sen2.length; j++) {
				System.out.print(sen2[j]+" ");
			}
	}

}
