package debuggingInEclipse;

public class App {
	public static void main(String[] args) {
		
		Test test1 = new Test();
		
		int value = test1.getInitialValue();
		
		test1.doStuff(value);
		
		
		  
		System.out.println("starting");
		
		System.out.println("incrementing value");
		
		value++;
		value = value -8;
		System.out.println(value);
		
		
		System.out.println("finishing");
		
	}

}
