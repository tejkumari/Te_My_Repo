package day8Methods;
/**
 * Question 2 – return type is different, Method name & argument list  are same.
 */
public class overloading2 {
public double myMethod(double a, int b) {
	double add=a+b;
	System.out.println("First Method" );
	return add;
}
public long myMethod(int x, int y) {
	System.out.println("Second Method" );
	return (x+y);
}

public static void main(String[] args) {
	overloading2 obj = new overloading2();
	obj.myMethod(10, 50);
	obj.myMethod(20d , 100);
	
}
}
