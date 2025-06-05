package xyz;

import java.util.Collections;
import java.util.TreeSet;

public class EmpNamesRev {

	public static void main(String[] args) {
		TreeSet<String> Employees = new TreeSet<String>(Collections.reverseOrder());// used to store in the descending order
		Employees.add("Sumit");
		Employees.add("Karan");
		Employees.add("Anjali");
		Employees.add("Mohan");
		Employees.add("Zoya");
		System.out.println(" The employees are: "+Employees);
		System.out.println(Employees.reversed());
	}

}
