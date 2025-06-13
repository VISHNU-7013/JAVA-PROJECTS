package xyz;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreemapExm {

	public static void main(String[] args) {
		TreeMap<String, Long> phonebook = new TreeMap<String, Long>();
		phonebook.put("vishnu",7013403744l);
		phonebook.put("vardhan",9908005612l);
		phonebook.put("venkat",9959561697l);
		phonebook.put("basi",7013443322l);
		phonebook.put("jayanth",7013456655l);
		phonebook.put("puneeth",7013461122l);
		phonebook.put("mohan",70134772211l);
		phonebook.put("veera",9573769032l);
		System.out.println(phonebook);
		
		for(Map.Entry<String, Long> entry : phonebook.entrySet()) {
			System.out.println(entry.getKey() +" : "+ entry.getValue());
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name of the number u want:");
		String s = sc.next();
		if(phonebook.containsKey(s)) {
			System.out.println(s + " number is :" + phonebook.get(s) );
		}
		else {
			System.out.println("this name does not exist.");
		}

		sc.close();
	}

}
