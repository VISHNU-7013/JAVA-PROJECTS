package xyz;

import java.util.Scanner;

public class RainUmbrella {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input:");
		String a = sc.nextLine();
		if(a.equals("yes")) {
			System.out.println("Take an Umbrella");
			
		}
		else {
			System.out.println("no need of umbrella");
		}
		sc.close();
	}

}
