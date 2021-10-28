package ExceptionHandling;

public class ExcHandling8 {
	public static int divideNum(int m, int n)
	{
		int div = m / n;
		return div;
	}
	static void waitFor(long k) throws InterruptedException {
		Thread.sleep(k);
		System.out.println("I am done with waiting..");
	}
public static void main(String[] args)throws InterruptedException {
	ExcHandling8 obj = new ExcHandling8();
	try {
		System.out.println(obj.divideNum(43, 0));
	}
	catch(ArithmeticException e) {
		System.out.println("InterruptedException occurs: " +e);
	}
	waitFor(5000);
	System.out.println("Rest of the code..");
}
}