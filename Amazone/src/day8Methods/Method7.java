package day8Methods;

public class Method7 {
static int x=10, y=20, z=30;
	
public static void main(String[] args) {
	System.out.println("Input the first no x: " +x);
	System.out.println("Input the second no y: " +y);
	System.out.println("Input the third no z: " +z);
	
	Method7.average();
	
	
	System.out.println("Average of  a, b, c: " +Method7.newAverage(12, 15, 17));
	System.out.println("Average of  a, b, c: " +Method7.newAverage(22, 55, 18));
	System.out.println("Average of  a, b, c: " +Method7.newAverage(15, 15, 17));
	
	int p=55, q=58, r=82;
	System.out.println("Input  p: " +p);
	System.out.println("Input  q: " +q);
	System.out.println("Input  r: " +r);
	int average=(p+q+r)/3;
	System.out.println("Average  of p, q, r: " +average);
}

public static double average() {
	double res=(x+y+z)/3;
	System.out.println("Average of x, y, z: " +res);
	return res;
}
public static double newAverage(int a, int b, int c) {
	System.out.println("Input  a: " +a);
	System.out.println("Input  b: " +b);
	System.out.println("Input  c: " +c);
	int res2 = (a+b+c)/3;
	return(res2);
}
}
