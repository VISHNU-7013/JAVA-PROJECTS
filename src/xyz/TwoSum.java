package xyz;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		int[] arr = {6,3,8,7,4};
		int target = 9;
		
		HashMap<Integer, Integer> map = new HashMap<>();
		int [] result = new int[2];
		
		for(int i=0;i<arr.length;i++) {
			int comp = target - arr[i];
			
			if(map.containsKey(comp)) {
				result[0] = map.get(comp);
				result[1]=i;
				break;
			}
			
			map.put(arr[i], i);
		}
		
		System.out.println("Indices: "+result[0]+", "+result[1]);

	}

}
