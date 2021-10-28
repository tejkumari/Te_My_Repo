package DerivedCasting;
class A2 {
	void test1() {
		System.out.println("Running test1()");
	}
}
class B2 extends A2 {
	void test2() {
		System.out.println("Running test2()");
	}
}
class C2 extends B2 {
	void test3() {
		System.out.println("Running test3()");
	}
}
public class AutoUpCasting {
public static void main(String[] args) {
	System.out.println("***********Program starts*************");
	B2 b1 = new C2();	//auto-up-casting
	b1.test1();
	b1.test2();
	
	C2 c1=new C2();
	c1.test3();
	B2 b11=c1;
	//or
	//B2 b11=(C2)c1;	// B2 b11=new C2();	  explicit up casting
	//or
	A2 a11=c1;
	a11.test1();
	
	b11.test1();
	b11.test2();
	c1.

	System.out.println("***********Program Ends*************");
}
}
