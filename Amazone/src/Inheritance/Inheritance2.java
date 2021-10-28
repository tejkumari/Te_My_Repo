package Inheritance;

class A1 {
	static int a=10;
	int b=20;
	double c=50;		
}
class B1 extends A1{
	static int x=30;
	int y=40;
	double z=50;
//	int b=20;
//	double c=50;
}
class C1 extends B1{
	char p='A';
	float q=1993f;
	static char r='B';
//	int y=40;
//	double z=50;
//	int b=20;
//	double c=50;
}

public class Inheritance2 {
	public static void main(String[] args) {
		System.out.println("Class A1 static variable: " +A.a);
		System.out.println("Class B1 static variable: " +B.x);
		System.out.println("Class C1 static variable: " +C.r);
		
		A1 a1=new A1();
		System.out.println("Class A1 non-static variable: " +a1.b);
		System.out.println("Class A1 non-static variable: " +a1.c);
		
		B1 a2=new B1();
		System.out.println("Class B1 non-static variable: " +a2.y);
		System.out.println("Class B1 non-static variable: " +a2.z);
		
		C1 a3=new C1();
		System.out.println("Class A1 non-static variable: " +a3.b);
		System.out.println("Class B1 non-static variable: " +a3.z);
		System.out.println("Class A1 non-static variable: " +a3.c);
		System.out.println("Class B1 non-static variable: " +a3.y);
		System.out.println("Class C1 non-static variable: " +a3.p);
		System.out.println("Class C1 non-static variable: " +a3.q);
		
	}
}
