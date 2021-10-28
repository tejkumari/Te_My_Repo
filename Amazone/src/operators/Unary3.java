package operators;

public class Unary3 {
	public static void main(String[] args) {

		int a = 0, b;
		b = a++ + ++a + ++a + a;//b = 0+2+3+3=8
		a = b++ - ++b + b++ + ++b; //a= 8-10+10+12=20
		System.out.println("a: "+a);// 20
		System.out.println("b: "+b);// 12
		System.out.println("**********************");
		//a = 2;
		b = a-- + --a + --a + a;// b= 2+0+(-1)+(-1)=0
		System.out.println("a: "+a);//  -1
		System.out.println("b: "+b);//  0
		System.out.println("**********************");
		a = 21;
		b = --a + --a + --a + a + ++a + a++;//20+19+18+18+19+19=
		System.out.println(a);// 20
		System.out.println(b);// 113
		System.out.println("**********************");
		a = -2;
		b = a-- + a + ++a + a++ + ++a + a++ + a;//(-2)+(-3)+(-2)+(-1)+0+1=-8
		System.out.println(a);//1
		System.out.println(b);//-8
	}
}
