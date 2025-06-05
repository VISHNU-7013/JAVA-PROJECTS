package xyz;

import java.util.Scanner;

public class Calender {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Day You Want :");
		String Day = sc.nextLine().toLowerCase();
		switch(Day) {
		case "monday":
			System.out.println("Lets learn python");
			break;
			
		case "tuesday":
			System.out.println("Lets learn Java");
		break;

		case "wednesday":
			System.out.println("Lets learn Ruby");
		break;
		
		case "thursday":
			System.out.println("Lets learn DSA");
		break;
		
		case "friday":
			System.out.println("Lets learn SQL");
		break;
		
		case "satuarday":
			System.out.println("Lets learn C++");
		break;
		
		case "sunday":
			System.out.println("Lets Do Practice");
		break;
		default :
			System.out.println("ALWAYS DO PRACTICE");
			break;
	}
sc.close();
}
}
