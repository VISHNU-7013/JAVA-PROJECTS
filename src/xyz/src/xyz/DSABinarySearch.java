package xyz;

import java.util.Arrays;
import java.util.Scanner;

public class DSABinarySearch {

	public static void main(String[] args) {
		String [] names = {"Amit","Divya","Karan","Priya","Zoya"};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name : ");
		
		String name = sc.next();
		int index = Arrays.binarySearch(names,name);
		
		if(index>0) {
			System.out.println(name +" is present in the list "+index);
		}
		else {
			System.out.println(name+" Not in the list");
		}
		sc.close();

	}

}
