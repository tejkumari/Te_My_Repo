package day8Methods;

public class java1 {

	static int a,b,c,d,e,f;
	static double m,n,o;
	
	public void test1() {
		java1.a=1; java1.b=2; java1.c=3; java1.d=4; java1.e=5; java1.f=6;
		m= java1.a*java1.b+java1.c*java1.d+java1.e*java1.f;
		System.out.println("value of operation: " +m);
	}
	double test2() {
		a=11; b=22;c=33;d=44;e=55;f=66;
		n=a*b+c*d+e*f;
		System.out.println("value of operation: " +n);
		return n;
	}
	public static void main(String[] args) {
		java1 m1= new java1();
		m1.test1();
		m1.test2();
	}
}

