package xyz;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAdvntrTask {

	public static void main(String[] args) {
		List<String> cartoons = new ArrayList<String>();
		cartoons.add("Ben 10");
		cartoons.add("Dora");
		cartoons.add("Jackichan");
		cartoons.add("Oggy");
		cartoons.add("Doreaman");
		
		cartoons.remove(4);
		System.out.println(cartoons);
		System.out.println(cartoons.set(1, "MotuPatlu"));
		System.out.println(cartoons);
		
	}

}
