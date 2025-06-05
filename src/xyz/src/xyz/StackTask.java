package xyz;

import java.util.Stack;

public class StackTask {

	public static void main(String[] args) {
		Stack<String> foodplates = new Stack<String>();
		
		foodplates.push("Plate 1");
		foodplates.push("Plate 2");
		foodplates.push("Plate 3");
		foodplates.push("Plate 4");
		foodplates.push("Plate 5");
		
		System.out.println("The top Plate is : "+foodplates.peek());
		System.out.println("The plate taken to eat : " + foodplates.pop());
		System.out.println("The remaining Plates are : ");

		for(String plt : foodplates) {
		System.out.println(plt);
		}
	}

}
