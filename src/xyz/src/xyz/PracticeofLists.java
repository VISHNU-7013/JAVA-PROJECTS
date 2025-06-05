package xyz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PracticeofLists {

	public static void main(String[] args) {
		List<String> Legends =new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the names of legends:");
		for(int i=1;i<5;i++) {
			System.out.println("the legends are "+i+":");
			String names =sc.nextLine();
			Legends.add(names);
			
		}
		System.out.println(Legends);
		sc.close();
	}

}
