package ExceptionHandling;

public class ExcHandling2 {
	public static void main(String[] args) {
		System.out.println("***********Prm Starts**********");
		int i=10;
		int j;
		try {
			j=i/0;
			System.out.println("res: "+j);
		}catch(ArithmeticException obj) {
			System.out.println("Exception Handalled: " +obj );
			obj.printStackTrace();
		}
		
		
		int[] empIds = { 12, 20, 30 };
		try {
			System.out.println(empIds[3]);// ArrayIndexOutOfBoundsException
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception Handled: " + e);
		}
		System.out.println("Programs ends here...");
	}
}
