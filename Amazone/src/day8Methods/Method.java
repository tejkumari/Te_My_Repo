package day8Methods;

public class Method {

	static int a=10;
	 static int b=5;
	 static int add=a+b;
	 static int mult=a*b;
	 static int div=a/b;
	
	static void addTwoNum() {
	//int res=a+b;
	System.out.println("First no: " +a);
	System.out.println("Second no: " +b);
	//System.out.println("Addition: " +res);
	System.out.println("Addition: " +add);
	}
	
	static void multiplyTwoNum() {
		//int res=a*b;
		//System.out.println("First no: " +a);
		//System.out.println("Second no: " +b);
		//System.out.println("Multiplication: " +res);
		System.out.println("Multiplication: " +mult);
	}
	
	static void division() {
		//int res=a/b;
		//System.out.println("First no: " +a);
		//System.out.println("Second no: " +b);
		//System.out.println("Division: " +res);
		System.out.println("Division: " +div);
	}
	
	public static void main(String[] args) {
		Method.addTwoNum();
		Method.multiplyTwoNum();
		Method.division();
	}
	
	
}
