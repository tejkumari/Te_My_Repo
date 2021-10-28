package loops;

public class loop2_1 {
	void EvenOdd() {
	int a=1887224;
	if (a%2==0) 
		System.out.println(+a +"  is even no");
	else 
		System.out.println(+a +"  is odd no");
	return;
	}
	public static void main(String[] args) {
		System.out.println("Program for Even Odd number");
		loop2_1 obj = new loop2_1();
		obj.EvenOdd();
	}
}
