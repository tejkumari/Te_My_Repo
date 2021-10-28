package operators;

public class Unary4 {
	public static void main(String[] args) {

		int a = 7, b;
		b = a++ + ++a + ++a + a;//b = 7+9+10+10=36
		a = b++ - ++b + b++ + ++b; //a= 36-38+38+40=76
		System.out.println("a: "+a);// 76
		System.out.println("b: "+b);// 40
		System.out.println("**********************");
		a = 22;
		b = a-- + --a + --a + a;// b= 22+20+19+19=80
		a = b++ - ++b + b++ + ++b;// a= 80-82+82+84=164
		System.out.println("a: "+a);//  164
		System.out.println("b: "+b);//  84
		System.out.println("**********************");
		a = -5;
		b = --a + --a + --a + a + ++a + a++;//b=-6 + -7 + -8 + -8 + -7 + -7 =-43
		a = b++ - ++b + b++ + ++b;// a= -43 - -41 + -41 + -39= -82
		System.out.println("a: "+a);// -82
		System.out.println("b: "+b);// -39
		System.out.println("**********************");
		a = -2;
		b = a-- + a + ++a + a++ + ++a + a++ + a;//b= -2 + -3 + -2 + -2 + 0 + 0 + 1 =-8
		a = b++ - ++b + b++ + ++b; //a=-8 - -6 + -6 + -4= -12
		System.out.println("a: "+a);// -12
		System.out.println("b: "+b);//-4
	}
}
