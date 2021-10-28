package operators;

public class Unary2 {
	public static void main(String[] args) {

		int a = 23, b;
		b = a++;//  a=23  a=24 b=23
		int x = a, y;// a=24 x=24
		y = ++x;//  x=25 y=25
		
		System.out.println("a: "+a);// 24
		System.out.println("b: "+b);// 23
		System.out.println("x: "+x);// 25
		System.out.println("y: "+y);// 25
		System.out.println("*****************************");
		
		int p = 72, q = 95, res;

		res = p++ + --q;//res = 72 + 94=166
		System.out.println("res: "+res);//166
		System.out.println("p: "+p);//73
		System.out.println("q: "+q);//94
		System.out.println("*****************************");
		
		int res1 = ++p + ++q;//res1 = 74 + 95=169
		System.out.println(res1);//169
		System.out.println("p: "+p);//74
		System.out.println("q: "+q);//95
}
}