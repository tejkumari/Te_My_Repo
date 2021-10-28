package Array;
class Array1123{
	static int[] getArray() {
		return new int[] {1,5,9,3};
	}
}
public class ArrayAsReturn {
public static void main(String[] args) {
	int array11[]=Array1123.getArray();
	for(int i=0; i<array11.length; i++) {
		System.out.println(array11[i]);
	}
}
}
