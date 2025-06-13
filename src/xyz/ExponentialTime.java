package xyz;

public class ExponentialTime {
	
	//This function runs O(2^n) time
	public static int fibonacci(int n) {
		if(n<=1) {
			return n;
		}
		//It calls itself twice
		return fibonacci(n-1) + fibonacci(n-2);
	}
	

	public static void main(String[] args) {
		int n=5;// Try small numbers like 5,6,7
		System.out.println("Fibonacci of "+ n +" is: "+fibonacci(n));

	}

}
