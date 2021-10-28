package AssigPgm;

public class SwapTwoNo {
	static int Swap(int a, int b) {
		System.out.println("Before Swaping");
		System.out.println(a);
		System.out.println(b);
		//int temp=0;
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After Swaping");
		System.out.println(a);
		System.out.println(b);
		return a;
	}
	
	
public static void main(String[] args) {
	SwapTwoNo.Swap(1234, 9879);
	SwapTwoNo.Swap(89573985, 8-84-284-48);
}
}
