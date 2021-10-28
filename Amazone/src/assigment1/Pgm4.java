package assigment1;

public class Pgm4 {
double QutRem( int a, int b) {
	double res = a/b;
	System.out.println("value of a: " +a);
	System.out.println("value of b: " +b);
	System.out.println("value of Quotient : "  +res);
	double res2=a%b;
	System.out.println("value of Remainder : "  +res2);
	return (res);
}
	public static void main(String[] args)   { 
		Pgm4 obj =new Pgm4();
		obj.QutRem(15, 6);
		
		
		
	
}
}
