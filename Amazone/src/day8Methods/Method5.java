package day8Methods; 
// Package names are written in all lower case to avoid conflict with the names of classes or interfaces. 

public class Method5 {
//The first letter of class names are capitalized to distinguish class names from member names/variables.
	int a, b=40;
	static double c;
	double res;
	
	static void average() {
		Method5 obj = new Method5();
		obj.a=10;  c=50; 
		obj.res= (obj.a + obj.b + Method5.c)/3;
		System.out.println("Average is: " +obj.res);
		return;
	}
	double sum() {
		a=100;  c=500;
		res = a + b + Method5.c;
		return(res);
	}
	double multiply(int x, double y) {
		double mult= x*y;
		return(mult);
	}
	double division(double a, double b) {
		Method5 obj3= new Method5();
		obj3.res= a/b;
		return(obj3.res);
	}
	public static void main(String[] args) {
		Method5.average();
		
		Method5 obj1 = new Method5();
		double add= obj1.sum();
		System.out.println("Addition is: " +add);
		
		Method5 obj2 = new Method5();
		obj2.multiply(33, 33.33);
		System.out.println("Multiplication is: " +obj2.multiply(33, 33.33) );
		
		Method5 obj4 = new Method5();
		obj4.division(41.00, 20.50);
		double div=obj4.division(44.29, 2.5);
		System.out.println("Division is " +obj4.division(44.29, 20.50));
		System.out.println("Division is " +div);
	}
}