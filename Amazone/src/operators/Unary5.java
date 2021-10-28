package operators;

public class Unary5 {
	public static void main(String[] args) {

		int a = 0, b;
		b = a++ + ++a + ++a + a;//b = 0 + 2 + 3 + 3 = 8
		//a = b++ - ++b + b++ + ++b; //a= 36-38+38+40=76
		System.out.println("a: "+a);// 3
		System.out.println("b: "+b);// 8
		System.out.println("**********************");
		a = 0;
		b = a-- + --a + --a + a;// b= 0 + -2 + -3 + -3 = -8
		//a = b++ - ++b + b++ + ++b;// a= 80-82+82+84=164
		System.out.println("a: "+a);//  -3
		System.out.println("b: "+b);//  -8
		System.out.println("**********************");
		a = 0;
		b = --a + --a + --a + a + ++a + a++;//b= -1 + -2 + -3 + -3 + -2 + -2 = -13
		//a = b++ - ++b + b++ + ++b;// a= -43 - -41 + -41 + -39= -82
		System.out.println("a: "+a);// -2
		System.out.println("b: "+b);// -13
		System.out.println("**********************");
		a = 0;
		b = a-- + a + ++a + a++ + ++a + a++ + a;//b= 0 + -1 + 0 + 0 + 2 + 2 + 3 = 6
		//a = b++ - ++b + b++ + ++b; //a=-8 - -6 + -6 + -4= -12
		System.out.println("a: "+a);//  3
		System.out.println("b: "+b);// 6
	}
}
