package xyz;

public class LinearSearchInArray {

	public static void main(String[] args) {
		int[] arr = {11,12,13,14,15};
		int target = 13;
		boolean found = false ;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==target) {
				System.out.println("Found "+target+" at index "+i);
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println("Element does not found.");
		}
	}

}
