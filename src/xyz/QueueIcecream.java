package xyz;

import java.util.LinkedList;
import java.util.Queue;

public class QueueIcecream {

	public static void main(String[] args) {
		Queue<String> kids = new LinkedList<String>();
		kids.add("mohan");
		kids.add("venkat");
		kids.add("basi");
		kids.add("anil");
		kids.add("vishnu");
		
		System.out.println("The first kid is : "+kids.peek());
		System.out.println("The Serving to :"+kids.poll());
		System.out.println("The new kid added at last is "+kids.add("dada"));
		System.out.println(kids);

	}
}
