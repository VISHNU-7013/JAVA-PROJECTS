package xyz;
import java.util.HashSet;
import java.util.Scanner;

public class HashSetStudents {

	public static void main(String[] args) {
		HashSet<String> StudentsList = new HashSet<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the names of 5 students:");
		for(int i=1;i<=5;i++) {
			System.out.println("Enter the name of the student:"+ i +":");
			String name = sc.nextLine();
			StudentsList.add(name);
		}
		System.out.println("Students names are:");
		for(String sl : StudentsList){
			System.out.println(sl);
		}
		sc.close();

	}

}
