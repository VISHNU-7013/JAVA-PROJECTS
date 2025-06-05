package xyz;

import java.util.Scanner;

public class DSASqRootUsingBNS {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Integer :");
		int n= sc.nextInt();
		
		if(n<0) {
			System.out.println("Square root not defined for the negative numbers  ");	
		}
		else {
			int l = 0;
			int h = n;
			int res = 0;
			
			while(l<=h) {
				int m = l+(h-l)/2;
				long Square = (long) m*m;
				
				if(Square == n) {
					res = m;
					break;
				}
				else if(Square<n) {
					res = m;
					l = m+1;
				}
				else {
					h = m -1;
				}
			}
			System.out.println("The square root of integer "+n+"is : "+res);
		}
		sc.close();

	}

}
