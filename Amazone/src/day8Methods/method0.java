package day8Methods;

public class method0 {
	
	static void addition(int a, float b) {
		float res=a+b;
		System.out.println("Addition: " +res);
	}
	
	static void multiplication(float x, double y) {
		double res=x*y;
		System.out.println("Multilication: " +res);
	}
	
	static void division(int p, int q) {
		int res=p/q;
		System.out.println("Division: " +res);
	}
	
	public static void main(String[] args) { 
		method0.addition(10, 15);
		method0.multiplication(15, 5.5);
		method0.division(15, 3);
	}
	
}
