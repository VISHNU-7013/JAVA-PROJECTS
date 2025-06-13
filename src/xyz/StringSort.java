package xyz;

import java.util.Arrays;

public class StringSort {

	public static void main(String[] args) {
		String [] names = {"vishnu","riyaz","venkatesh","dada"};
		System.out.println("before sort");
		System.out.println();
			for(String sr : names) {
				System.out.println(sr+" ");
			}
			System.out.println();
			Arrays.sort(names);
			System.out.println("After sorting");
			System.out.println();
			for(String stn : names ) {
				System.out.println(stn+" ");
			}

	}

}
