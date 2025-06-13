package xyz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectcionFrameWorkEx {

	public static void main(String[] args) {
		List<String> mobiles = new ArrayList<String>();
		mobiles.add("Realme 6i");
		mobiles.add("pova 6");
		mobiles.add("honor 9");
		mobiles.add("lenovo");
		mobiles.add("lava 6");
		mobiles.add("Iphone 15");
		mobiles.add("vivo y 25");
		mobiles.add("Redmi 11");
		mobiles.add(" Nothing 3a pro");
		
		Collections.sort(mobiles);
		
		System.out.println(mobiles);
		
		Collections.reverse(mobiles);
		
		for(int i=0;i<mobiles.size();i++) {
			System.out.println("Mobile " + (i + 1) + ": " + mobiles.get(i));
		}
		
		if(mobiles.contains("Iphone 15")) {
			System.out.println("Iphone is in the List");
		}
		else {
			System.out.println("Iphone is not there in the List");
		}
	}
}
