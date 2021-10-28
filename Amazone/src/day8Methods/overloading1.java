package day8Methods;
/**
 * what if return type, method name and argument list are same.
 */
public class overloading1 {

	static void add(int a, int b) {
		double res= a+b;
		System.out.println("addition is: " +res);
		return;
	}
	static void add( double a, int b) {
		double res= a+b;
		System.out.println("addition is: " +res);
		return;
	}
	public static void main(String[] args) {
		
		overloading1.add(25, 77);
		overloading1.add(20, 30);
	}
}
