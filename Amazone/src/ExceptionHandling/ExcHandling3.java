package ExceptionHandling;

public class ExcHandling3 {

	public static void main(String[] args) {

		try {
		int a[]=new int[5];
		a[7]=30;
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		}catch (Exception e) {
			System.out.println("Parent Exception occurs");
		}
	
	try {
		int a[]=new int[5];
		a[5]= 30/0;
	}catch (ArithmeticException e) {
		System.out.println("ArithmeticException occurs " );
	}catch (ArrayIndexOutOfBoundsException b) {
		System.out.println("ArrayoutOfboundException occurs " );
	}catch (Exception e) {
		System.out.println("Parent Exception occurs");
	}
	System.out.println("Programs ends here...");
	}
}

	/**
	* try block can have multiple catch block, but only one catch block will be executed 
	* try can handle only one abnormal condition at a time
	* unreachable code: a block of code which never executed by JVM
	*/