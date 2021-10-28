package Inheritance;
class A11 {
	static int a=10;
	int b=20;
	double c=50;		
}
class B11 extends A11{
	static int x=30;
	int y=40;
	double z=50;
	 void didplay() {
		System.out.println("Class A1 static variable: " +A11.a);
		System.out.println("Class B1 static variable: " +B11.x);
		System.out.println("Class A1 non-static variable: " +super.b);
		System.out.println("Class A1 non-static variable: " +super.c);
		
		B11 b1=new B11();
		System.out.println("Class B1 static variable: " +b1.y);
		System.out.println("Class B1 static variable: " +b1.z);
		System.out.println("****************************************************************");
		C11.didplay(11);
	}	
}
class C11 extends B11{
	char p='A';
	float q=1993f;
	static char r='B';
	static void didplay(int a) {
		System.out.println("Class A1 static variable: " +A11.a);
		System.out.println("Class B1 static variable: " +B11.x);
		System.out.println("Class C1 static variable: " +C11.r);
		
		C11 c1=new C11();
		System.out.println("Class C1 non-static variable: " +c1.p);
		System.out.println("Class A1 non-static variable: " +c1.b);
		System.out.println("Class B1 non-static variable: " +c1.y);
		System.out.println("################################################################################");
		
	}	
	
	void didplay() {
		//System.out.println("Class C1 non-static variable: " +super.p);
		System.out.println("Class A1 non-static variable: " +super.b);
		System.out.println("Class B1 non-static variable: " +super.y);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	}
	void main() {
		super.didplay();
	}
}
public class Inheritance3 {
public static void main(String[] args) {
	System.out.println("************************Pgm starts********************");
	C11 c1=new C11();
	c1.didplay();
	c1.main();
}
}
