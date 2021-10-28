package ExceptionHandling;


public class ExcHandling4 {
public static void main(String[] args) {
	try {
		int a='A';
		int b='a';
		//int c=a/1;
		int c=a/0;
		System.out.println(c);
//	}catch(ArithmeticException e) {
//		System.out.println("ArithmeticException occurs: ");
//	}catch (ArrayIndexOutOfBoundsException e) {
//		System.out.println("task 2 completed");
//	}catch (NullPointerException e) {
//		System.out.println(e);
	}catch (Exception e) {
		System.out.println("Exception common task completed");
	}catch (Throwable e) {
		System.out.println("Throwable common task completed");
	}
	finally { //finally block executed regardless of exception occurred or not
		System.out.println("Finally Exception is handalles sucessfully");
	}
	System.out.println(" Pgm ends");

		
	}
}

