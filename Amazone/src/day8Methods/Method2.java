package day8Methods;

public class Method2 {
	 double a=50;
	 static double b=10;
	 
	 public static void addition() {
		 Method2 obj = new Method2(); 
		 double add= obj.a+b;
		 System.out.println("Addition is: " +add);
	 }
	 
	 public double subtraction(int a, int b) {
		 int res= a-b;
		 System.out.println("subtract b from a: " +res);
		 double sub=a-Method2.b;
		 System.out.println("Subtraction of a and b: " +sub);
		 return(res);
	 }

	 public static void multiply(int x, int y) {
		 int mult= x*y;
		 System.out.println("Multiplication is: " +mult);
	 }
	
	public static void main(String[] args) {
		
		Method2.addition();
		
		Method2 obj1 = new Method2();
		double res= obj1.subtraction(55, 20);
		System.out.println("Subtraction is: " +res);
		
		Method2.multiply(20, 50);
		
	}
}
