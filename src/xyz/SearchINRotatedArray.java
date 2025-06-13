package xyz;

public class SearchINRotatedArray {
	public static void main (String[] arg) {
		int[] arr = {6, 7, 8, 1, 2, 3};
		int target = 6;
		
		int index = search(arr, target);
		System.out.println("Index of the target: "+ index);
		
	}
	public static int search(int[] arr,int target) {
		int low =0;
		int high = arr.length-1;
		
		while(low<=high) {
			int mid = low+(high-low)/2;
			
			if(arr[mid]==target)
				return mid;
			
			if(arr[low]<=arr[mid]) {
				if(arr[low]<=target && target<=arr[mid])
					high = mid-1;
				else
					low = mid+1;
				
			}
			else {
				if(arr[mid]<target && target<=arr[high])
					low = mid+1;
				else
					high = mid-1;
				
			}

		}
		return -1;

	}

}
