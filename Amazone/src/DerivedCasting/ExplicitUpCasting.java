package DerivedCasting;
class A {
	void test1() {
		System.out.println("Running test1()");
	}
}
class B extends A {
	void test2() {
		System.out.println("Running test2()");
	}
}
class C extends B {
	void test3() {
		System.out.println("Running test3()");
	}
}
public class ExplicitUpCasting {
public static void main(String[] args) {
	System.out.println("***********Program starts*************");
	C c1=new C();
	B b1=(B)c1;
	b1.test1();
	b1.test2();
	
	B b11=new B();
	A a1=(A)b11;
	a1.test1();
	
	A a11=(A)c1;
	a11.test1();
	
	System.out.println("***********Program Ends*************");

}
}
