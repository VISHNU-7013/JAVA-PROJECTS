package xyz;

import java.util.*;

public class HashMapCollections {

	public static void main(String[] args) {
		HashMap<Integer, String> mobiles = new HashMap<Integer, String>();
		mobiles.put(3390,"Lenovo");
		mobiles.put(3391,"Asus");
		mobiles.put(3392,"HP");
		mobiles.put(3393,"Dell");
		mobiles.put(3394,"Samsung");
		mobiles.put(3395,"Realme");
		mobiles.put(3396,"Vivo");
		System.out.println("Mobiles are :" + mobiles);
		
		mobiles.remove(3394);
		System.out.println(mobiles);
		
		mobiles.replace(3390, "IQOO");
		
		
		for (Integer key : mobiles.keySet()) {
		    System.out.println(key + " : " + mobiles.get(key));
		}
		}
			
	}

