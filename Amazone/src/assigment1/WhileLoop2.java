package assigment1;

public class WhileLoop2 {
	
	int reverseNum(int a) {
		int rev = 0;
		System.out.println("Number is: " +a);
		
		while(a!=0) {
			
			int rem =a % 10;
			rev = rev* 10 + rem;
			a= a / 10;
		}
		System.out.println("Reverse of Number is: " +rev);
		return (rev);
	}
	
public static  void main(String[] args) {
	WhileLoop2 obj = new WhileLoop2();
	obj.reverseNum(679237543);
	obj.reverseNum(212145);
		
	
}
}
