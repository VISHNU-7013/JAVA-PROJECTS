package xyz;

import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> students=new LinkedList<String>();
		students.add("student1");
		students.add("student2");
		students.add("student3");
		students.add("student4");
		System.out.println(students);
		//String firstout =students.poll();
		//System.out.println(firstout);
		System.out.println(students.remove());
		System.out.println(students);
		
		

	}

}
