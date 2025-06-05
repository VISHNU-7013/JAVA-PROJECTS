package xyz;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		
		int n = sc.nextInt();
		
		int originalnum = n;
		int reversed = 0;
		
		while(n>0) {
			int d = n % 10;
			reversed = reversed * 10 + d;
			n = n/10;
		}
		sc.close();
		
		if(reversed == originalnum) {
			System.out.println("It is a palindrome.");
		}
		else {
			System.out.println("It is not palindrome.");
		}
	}
	

}
