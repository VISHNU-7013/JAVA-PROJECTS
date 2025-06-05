package xyz;

class Calculator{
	int calculate(int a,int b) {
		return a+b;
	}
	double calculate(double a, double b) {
		return a+b;
	}
	int calculate(int a,int b,int c) {
		return a*b*c;
	}
	
}
public class OverloadingExample {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.calculate(10, 20));
		System.out.println(c.calculate(10.5, 21.5));
		System.out.println(c.calculate(25, 10, 10));
	}

}
