package assigment1;

public class SwitchCase {
	static int a=19, b=5, res;
	
	static void Calculator(char operater) {
		switch (operater) {
		case '-':
			res = a - b;
			System.out.println("Value of A: " + a);
			System.out.println("Value of B: " + b);
			System.out.println("a - b = " + res);
			break;
		case '+':
			res = a + b;
			System.out.println("Value of A: " + a);
			System.out.println("Value of B: " + b);
			System.out.println("a + b = " + res);
			break;
		case '/':
			res = a / b;
			System.out.println("Value of A: " + a);
			System.out.println("Value of B: " + b);
			System.out.println("a / b = " + res);
			break;
		case '*':
			res = a * b;
			System.out.println("Value of A: " + a);
			System.out.println("Value of B: " + b);
			System.out.println("a * b = " + res);
			break;
		case '%':
			res = a % b;
			System.out.println("Value of A: " + a);
			System.out.println("Value of B: " + b);
			System.out.println("a % b = " + res);
			break;
		default:
			System.out.println("Unknown operation");
			break;
	}
	}
public static void main(String[] args) {
	SwitchCase.Calculator('+');
	SwitchCase.Calculator('-');
	SwitchCase.Calculator('%');
}
}
