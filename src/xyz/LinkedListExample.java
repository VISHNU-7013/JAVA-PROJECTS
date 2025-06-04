package xyz;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> student = new LinkedList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter names Of 5 students");
		for(i=1;i<5;i++) {
			System.out.println("Enter name of the student:"+ i +":");
			String name = sc.nextLine();
			students.add(name);
		}
		System.out.println("students names are:");
		for(String student : students) {
			System.out.println(student);
		}
		sc.close();
	}

}
