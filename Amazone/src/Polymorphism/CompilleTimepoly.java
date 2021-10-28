package Polymorphism;
	
public class CompilleTimepoly {
	static void sum(int a, int b) {
		int c = a + b;
		System.out.println("Addition of two numbers :" + c);
	}
	static void sum(int a, int b, int e) {
		int c = a + b + e;
		System.out.println("Addition of three numbers :" + c);
	}
public static void main(String[] args) {
	System.out.println("***Compile-time polymorphism by OVERLOADING***");
	CompilleTimepoly.sum(21, 46);
	CompilleTimepoly.sum(54, 32, 54);
}
}
