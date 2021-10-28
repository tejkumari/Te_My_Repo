package ExceptionHandling;

public class ExcHandling9 {
static void divide(int a, int b) {
	int res=a/b;
	System.out.println("Division: " +res);
}
public static void main(String[] args) {
	try{
		//divide(23, 10);
		divide(23, 0);
		
	}
	catch(ArithmeticException ae) {
		System.out.println("caught in main() method: " +ae); 
		
	}
	finally {
		System.out.println("Exception is handled: ");
	}
	System.out.println("Rest code...");
}
}
