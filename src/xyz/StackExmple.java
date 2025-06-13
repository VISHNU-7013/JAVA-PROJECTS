package xyz;

import java.util.Stack;

public class StackExmple {

	public static void main(String[] args) {
		Stack<String> elements = new Stack<String>();
		
		elements.push("Write");
		elements.push("Delete");
		elements.push("Insert");
		
		System.out.println("The last action of  the stack: "+elements.peek());
		
		System.out.println("The undo actions are "+elements.pop() +" & "+elements.pop());
		//elements.pop();
		
		System.out.println("The remaining actions actions in the stack: "+elements);

	}

}
