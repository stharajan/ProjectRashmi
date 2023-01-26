package arrayOfString;

public class App {
	public static void main(String[] args) {
		
		String sentence[] = {"i", "love to", "travel", "faraway", "places"};
		
		System.out.println(sentence[0]+" "+ sentence[1]+" "+ sentence[2]);
		
		sentence[4] = "countries";		// changing values
		
		for(String words: sentence) {
			System.out.print(words+" ");
		}
				
	}

}
