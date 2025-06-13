package xyz;

import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the word : ");
		String word = sc.nextLine();
		
		String original = word.toLowerCase();
		String reversed = "";
		
		
		// Reverse the word
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        
        
        
        // Check for palindrome
        if (original.equals(reversed)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
        sc.close();
     }

}
