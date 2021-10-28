package Array;

public class Array3 {
public static void main(String[] args) {
	int[] array3333= {92, -9, 8, 53, -2};
	System.out.println(array3333.length);
	
	int sum=0;
	for(int num:array3333) {
		sum=sum+num;
	}
	System.out.println("Sum of array elements: " +sum);
	int arrlength=array3333.length;
	int avg= sum/arrlength;
	System.out.println("Average of array elements: " +avg);
}
}
