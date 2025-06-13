package xyz;

public class LinearTimeExample {
	
	//o(n) method - prints all elements in the Arrray
	public static void printAllElements(int[] arr){
		for(int i =0;i<arr.length;i++) {
			System.out.println("Element "+ i +":"+arr[i]);
		}
	}

	public static void main(String[] args) {
		int numbers[] = {10,20,30,40,50};
		
		//calling the o(n) method
		printAllElements(numbers);
		}

	}

