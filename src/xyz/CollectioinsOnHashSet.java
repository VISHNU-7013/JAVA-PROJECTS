package xyz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CollectioinsOnHashSet {

	public static void main(String[] args) {
		HashSet<String> Laptops = new HashSet<String>();
		Laptops.add("Asus");
		Laptops.add("Dell");
		Laptops.add("Lenovo");
		Laptops.add("Lava");
		Laptops.add("HP");
		Laptops.add("Samsung");
		Laptops.add("Realme");
		Laptops.add("Asus");
		System.out.println(Laptops);
		
		if(Laptops.contains("Lenovo")) {
			System.out.println("Lenovo is in the List");
		}
		else {
			System.out.println("Lenovo not in the List");
		}
		ArrayList<String> LaptopsList = new ArrayList<String>(Laptops);
		
		System.out.println(LaptopsList);
		
		Iterator<String> it = Laptops.iterator();
		while(it.hasNext()) {
			String laptop = it.next();
        System.out.println(laptop);
		}
	}

}
