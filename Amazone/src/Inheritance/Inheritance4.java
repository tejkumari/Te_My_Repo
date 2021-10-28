package Inheritance;

class A111 {
	static int a=10;
	int b=20;
	double c=50;	
	void didplay() {
		System.out.println("Class A1 static variable: " +A11.a);
		A11 a1=new A11();
		System.out.println("Class A1 non-static variable: " +a1.b);
		System.out.println("Class A1 non-static variable: " +a1.c);
		System.out.println("###########################################################");
	}
}
class B111 extends A111{
	static int x=30;
	int y=40;
	double z=50;
	 void didplay() {
		System.out.println("Class A1 static variable: " +A11.a);
		System.out.println("Class B1 static variable: " +B11.x);
		
//super keyword is used to access immediate parent class members(variables and methods)
		System.out.println("Class A1 non-static variable: " +super.b);
		System.out.println("Class A1 non-static variable: " +super.c);
		
		B111 b1=new B111();
		System.out.println("Class B1 static variable: " +b1.y);
		System.out.println("Class B1 static variable: " +b1.z);
		System.out.println("****************************************************************");
		super.didplay();
	}	
}
public class Inheritance4 {
public static void main(String[] args) {
	B111 b1=new B111();
	b1.didplay();
}
}
