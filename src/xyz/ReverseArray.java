package xyz;

public class ReverseArray {

	public static void main(String[] args) {
		int [] Arr = {10,20,30,40};
		for(int i=0,j=Arr.length-1;i<j;i++,j--) {
			int temp = Arr[i];
			Arr[i]=Arr[j];
			Arr[j]=temp;
		}
		
		System.out.println("Reversed Arrray:");
		for(int arr : Arr) {
			System.out.print(arr+" ");
		}
	}

}
