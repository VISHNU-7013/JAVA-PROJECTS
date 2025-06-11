package xyz;

public class ConstantTimeExample {
	
	public static void printFirstElement(int [] arr) {
		if(arr.length>0) {
			System.out.println("First Element is: "+arr[0]);
		}
		else {
			System.out.println("Array is empty.");
		}
	}

	public static void main(String[] args) {
		int [] nums = {10,20,30,40,50,70,88,66,56,55,44,22,558,84855,6455};
		printFirstElement(nums);
		

	}

}
