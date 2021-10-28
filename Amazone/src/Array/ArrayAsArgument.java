package Array;
class array123{
	static void min(int arr[]) {
		int min=arr[0];
		for(int i=1; i<arr.length; i++) {
			if(min>arr[i])
				min=arr[i];
			
		}
		System.out.println("Min number in array is: "+min);
	}
	static void max(int arr[]) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("Max number in array is: "+max);
	}
}

public class ArrayAsArgument {	
public static void main(String[] args) {
	int a[]= {45, 6, 22, 7, 87};
	array123.min(a);
	array123.max(a);
}
}
