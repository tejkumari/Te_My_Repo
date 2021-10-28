package assigment1;

public class WhileLoop3 {
	static void palindromNum(int a) {
		System.out.println("Number: " +a);  
		int rem, sum = 0, temp = a;
		while(a>0) {
			rem = a % 10;
			sum = (sum*10) + rem;
			a = a/10;
		}
		if (temp == sum)
			System.out.println("Number is Palindrome ");  
		else
			System.out.println("Number is not Palindrome ");  
}
	public static void main(String[] args) {
		WhileLoop3.palindromNum(1123544);
		WhileLoop3.palindromNum(123321);
	}
}
