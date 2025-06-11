package xyz;

public class ReverseWordsString {

	public static void main(String[] args) {
		
		String sen = "I am learning java with DSA";
		String [] words = sen.split(" ");
		String reversed = "";
		
		for (int i = words.length - 1; i >= 0; i--) {
            reversed += words[i] + " ";
        }
		
		System.out.println("Original String : "+sen);
		
		System.out.println("Reversed String : "+reversed);

	}

}
