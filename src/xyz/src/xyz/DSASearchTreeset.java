package xyz;

import java.util.Scanner;
import java.util.TreeSet;

public class DSASearchTreeset {

	public static void main(String[] args) {
		TreeSet<String> Products = new TreeSet<String>();
		
		Products.add("Keyboard");
		Products.add("Mouse");
		Products.add("Monitor");
		Products.add("CPU");
		Products.add("Webcam");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the product name : ");
		String name = sc.next();
		if(Products.contains(name)) {
			System.out.println(name +" is present in the set.");
		}
		else {
			System.out.println(name + " is not there in the set");
		}
sc.close();
	}

}
