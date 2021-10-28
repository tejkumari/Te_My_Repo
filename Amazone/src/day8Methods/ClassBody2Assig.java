package day8Methods;
class Demo{
	int a;
	static int b;
	static {
		Demo obj = new Demo();
		obj.a= 50;
		System.out.println("Value of A is: " +obj.a);
	}
	{
		Demo.b= 20;
	}
	static void add(int c) {
		System.out.println("Value of B is: " +b);
		System.out.println("Value of C is: " +c);
		
		Demo obj = new Demo();
		obj.a=100;
		System.out.println("Updated Value of A is: " +obj.a);
		int res = obj.a + b + c;
		System.out.println("Addition of A, B & C is: " +res);
	}
	
	void add(int d, int e) {
		System.out.println("Value of D is: " +d);
		System.out.println("Value of E is: " +e);
		Demo obj = new Demo();
		obj.a =101;
		System.out.println("Updated Value of A is: " +obj.a);
		int res = obj.a + b + d + e;
		System.out.println("Addition of A, B, D & E is: " +res);
	}
}
public class ClassBody2Assig {
	int num1;
	static int num2;
	static {
		ClassBody2Assig obj = new ClassBody2Assig();
		obj.num1 = 10;
	}

	{
		num2 = 20;
	}
	
	void mult(int num3) {
		ClassBody2Assig obj = new ClassBody2Assig();
		obj.num1 =100;
		System.out.println("Updated Value of Num1 is: " +obj.num1);
		System.out.println("Value of Num1 is: " +obj.num1);
		System.out.println("Value of Num2 is: " +num2);
		System.out.println("Value of Num3 is: " +num3);
		int res = obj.num1 * num2 * num3;
		System.out.println("Multiplication of Num1, Num2 & Num3 is: " +res);
		}
	
	static void mult(int num4, int num5) {
		
		System.out.println("Value of Num4 is: " +num4);
		System.out.println("Value of Num5 is: " +num5);
		ClassBody2Assig obj1 = new ClassBody2Assig();
		obj1.num1=60;
		System.out.println("Updated Value of Num1 is: " +obj1.num1);
		int res = obj1.num1 * num2 * num4 * num5;
		System.out.println("Multiplication of Num1, Num2, Num4 & Num5 is: " +res);
	}
	
 public static void main(String[] args) {
	 
	 ClassBody2Assig obj1 = new ClassBody2Assig();
	 obj1.mult(30);
	 ClassBody2Assig.mult(50, 60);
	 Demo.add(55);
	 Demo obj = new Demo();
	 obj.add(70, 90);
}
}
