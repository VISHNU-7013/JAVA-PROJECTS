package xyz;

import java.util.TreeSet;

public class DSATreeSetLibrarybook {

	public static void main(String[] args) {
		TreeSet<Integer> BookIds = new TreeSet<Integer>();
		BookIds.add(5002);
		BookIds.add(4998);
		BookIds.add(5005);
		BookIds.add(4999);
		BookIds.add(5001);
		
		System.out.println(BookIds);
		
		System.out.println("First book id is : "+BookIds.getFirst());
		
		System.out.println("The last book id is : "+BookIds.getLast());
		
		System.out.println(BookIds.higher(4999));
		System.out.println(BookIds.lower(5005));

	}

}
