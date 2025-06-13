package xyz;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		
		int n = sc.nextInt();
		
		if(n%2 == 0) {
			System.out.println(" It is  a even number ");
		}
		else {
			System.out.println("It is a odd number");
			
		}
		sc.close();
	}
}
