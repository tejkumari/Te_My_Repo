package Inheritance;
class A {
	static int a=10;
	int b=20;
	double c=50;		
}
class B {
	static int x=30;
	int y=40;
	double z=50;
}
class C {
	char p='A';
	float q=1993f;
	static char r='B';
}
public class Inheritance1 {
public static void main(String[] args) {
	System.out.println("Class A static variable: " +A.a);
	System.out.println("Class B static variable: " +B.x);
	System.out.println("Class C static variable: " +C.r);
	
	A a1=new A();
	System.out.println("Class A non-static variable: " +a1.b);
	
	B a2=new B();
	System.out.println("Class B non-static variable: " +a2.z);
	
	C a3=new C();
	System.out.println("Class C non-static variable: " +a3.p);
	
}
}
