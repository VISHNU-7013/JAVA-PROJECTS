package xyz;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<String>();
		cities.add("Mumbai");
		cities.add("Kerala");
		cities.add("Andhra");
		cities.add("Delhi");
		cities.add("Goa");
		System.out.println(cities);
		System.out.println(cities.get(0));
		cities.set(0,"chennai");
		System.out.println(cities);
		cities.remove(0);
		System.out.println(cities);
	}

}
