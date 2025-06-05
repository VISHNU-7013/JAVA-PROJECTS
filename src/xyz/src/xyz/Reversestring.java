package xyz;

public class Reversestring {

	public static void main(String[] args) {
		String original = "Rushikesh";
		String reversed = new StringBuilder(original).reverse().toString();
		System.out.println(original);
		System.out.println(reversed);

	}

}
