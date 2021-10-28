package ExceptionHandling;
class UserDefinedException extends Exception{
	public UserDefinedException (String str) {
		super(str);
	}
}
public class ExcHandling6 {
public static void main(String[] args) {
	try {
		throw new UserDefinedException("This is user-defined exception");
	}
	catch(UserDefinedException ude) {
		System.out.println("Caught the exception "+ude);
	}
	System.out.println("rest code...");
}
}
