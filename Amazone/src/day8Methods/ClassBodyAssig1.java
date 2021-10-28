package day8Methods;

public class ClassBodyAssig1 {
	int a; //non-static global variable
	static int b; // static global variable
	static { // static block
		ClassBodyAssig1 obj = new ClassBodyAssig1();
		obj.a=50;
		System.out.println("Value of A is: " +obj.a);
		
		}
	
	{  // non-static block
		b=25;
		//System.out.println("Value of B is: " +b);
	}
	static void add(int c) {
		ClassBodyAssig1 obj = new ClassBodyAssig1();
		System.out.println("Updated Value of A is: " +obj.a);
		System.out.println("Value of B is: " +b);
		System.out.println("Value of C is: " +c);
		int res = obj.a + b + c;
		System.out.println("Addition of A, B & C is: " +res);
	}
	
	void add(int d, int e) {
		ClassBodyAssig1 obj = new ClassBodyAssig1();
		obj.a = 50;
		System.out.println("Updated Value of A is: " +obj.a);
		System.out.println("Value of D is: " +d);
		System.out.println("Value of E is: " +e);
		int res = obj.a + b + d + e;
		System.out.println("Addition of A, B, D & E is: " +res);
	}
public static void main(String[] args) {
	ClassBodyAssig1.add(75);
	ClassBodyAssig1 obj = new ClassBodyAssig1();
	obj.add(55, 67);
	
	
}
}
