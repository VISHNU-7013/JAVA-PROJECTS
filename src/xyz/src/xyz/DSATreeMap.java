package xyz;

import java.util.TreeMap;

public class DSATreeMap {

	public static void main(String[] args) {
		TreeMap<String, String> countries = new TreeMap<String, String>();
		countries.put("India", "New Delhi");
		countries.put("USA", "Washington");
		countries.put("Germany", "Berlin");
		countries.put("Japan", "Tokyo");
		countries.put("India", "Delhi");
		System.out.println("The sorted entries are : "+ countries.firstKey());
		System.out.println("The sorted entries are : "+ countries.lastKey());
		System.out.println("The sorted entries are : "+ countries.higherKey("India"));
		System.out.println("The sorted entries are : "+ countries.lowerKey("Japan"));
	}

}
