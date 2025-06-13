package xyz;

public class SampleWrapper {

	public static void main(String[] args) {
		int a = 1;
		Integer b = 1;
		
		double price = 99.99;
		Double price1 = 99.99;

		System.out.println(a);
		System.out.println(b);
		
		for( int i=1;i<=10;i++) {
			System.out.println(i);
		}
			System.out.println("Max value of Integer: " + Integer.MAX_VALUE);
			System.out.println("Parsing String to Integer: " + Integer.parseInt("123"));
			System.out.println("Comparing Wrapper vs Primitive: " + Integer.compare(b, a));
	}

}
