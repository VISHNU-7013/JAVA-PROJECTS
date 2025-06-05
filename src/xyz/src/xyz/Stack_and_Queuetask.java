package xyz;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Stack_and_Queuetask {

	public static void main(String[] args) {
		Stack<String> ToyBox = new Stack<String>();
		
		ToyBox.push("Ball");
		ToyBox.push("Blocks");
		ToyBox.push("Puzzle");
		System.out.println("The top toy is :"+ ToyBox.peek());
		
		System.out.println("The toy is being played: "+ToyBox.pop());
		
		System.out.println("The reamining toys are : "+ToyBox);
		System.out.println("");
		
		Queue<String> IceLine = new LinkedList<String>();
		IceLine.add("Maya");
		IceLine.add("Leo");
		IceLine.add("Nina");
		System.out.println("The first ice cream served for :"+ IceLine.poll());
		
		System.out.println("Who are still in line for icecream "+IceLine);
		}

}
