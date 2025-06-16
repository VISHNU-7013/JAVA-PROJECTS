package professional;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<Integer, String> Students = new TreeMap<Integer, String>();
		Students.put(3390,"Vishnu");
		Students.put(3391,"Varshith");
		Students.put(3392,"Basireddy");
		Students.put(3393,"Venkatesh");
		Students.put(3394,"Vishnu");
		System.out.println(Students);
		
		System.out.println(Students.remove(3394));
		System.out.println(Students);
		
		System.out.println(Students.firstEntry());
		
		Students.replace(3390,"Dhoni");
		System.out.println(Students);
	}

}
