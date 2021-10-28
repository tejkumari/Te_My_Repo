package day8Methods;

public class overloading {
	static int a=10; 
	int b=55;
	double addition() {
		int add = a+b;
		System.out.println("value of a: " +a);
		overloading obj =new overloading();
		System.out.println("value of b: " +obj.b);
		System.out.println("Addition of a and b: " +add);
		return add;
	}
	static double addition(int x, int y) {
		int add = x+y;
		System.out.println("value of x: " +x);
		System.out.println("value of y: " +y);
		System.out.println("Addition of a and b: " +add);
		return add;
	}
	
public static void main(String[] args) {
	overloading obj = new overloading();
	obj.addition();
	overloading.addition(50, 35);
}
}
