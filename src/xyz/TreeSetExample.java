package professional;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<Integer>();
		numbers.add(50);
		numbers.add(20);
		numbers.add(10);
		numbers.add(40);
		numbers.add(30);
		numbers.add(20);
		numbers.add(80);
		numbers.add(60);
		System.out.println(numbers);
		System.out.println(numbers.first());
		System.out.println(numbers.higher(30));
		System.out.println(numbers.removeLast());
		System.out.println(numbers.reversed());
		System.out.println(numbers.toString());
		System.out.println(numbers.hashCode());
	}

}
