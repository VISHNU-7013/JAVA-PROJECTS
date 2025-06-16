package xyz;

public class BinarySearchInArray {

	public static void main(String[] args) {
		int [] numbers = {10,12,15,17,19};
		int left =0;
		int right = numbers.length-1;
		int target = 12;
		while(left<=right) {
			int mid = (left+right)/2;
			
			if(numbers[mid]==target) {
				System.out.println("found "+target+" at index "+mid);
				break;
			}else if(numbers[mid]<target) {
				left = mid-1;
				
			}else {
				right = mid +1;
			}
		}
	}

}
