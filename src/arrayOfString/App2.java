package arrayOfString;

public class App2 {
	public static void main(String[] args) {
		
		String array[] = new String[3];
		
		array[0] = "I love buttercups.";
		array[1] = "They are awesome.";
		array[2] = "do you want some?";
		
		System.out.println(array[0]);
		
		array[1] = "They are delicious.";
		
		System.out.println(array[1]);
		
		System.out.println("\n");
		
		for(String sentence: array) {
			
			System.out.println(sentence);
			
		}
				
	}

}
