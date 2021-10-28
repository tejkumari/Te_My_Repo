package ExceptionHandling;

public class ExcHandling5 {

	public static void validateAge(int age) {
		if(age<18) {
//throw is used only to throw Exception, not to handle it
			throw new ArithmeticException("Person is not eligible to vote");   
		}
		else {
			System.out.println("person is eligible to vote");
		}
	}
	public static void main(String[] args) {
		validateAge(15);
		validateAge(25);
		System.out.println("rest of the code...");    
}
}
