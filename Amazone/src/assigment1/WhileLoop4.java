package assigment1;

public class WhileLoop4 {
	static void primeNum(int a) {
		int i = 2;
		boolean flag = false; 
		
		while(i <= a/2) {
			if (a % i == 0) {
				flag = true;
			break;
			}
			++i;
}
		if (!flag) 
				System.out.println(+a +" Number is Prime");
			else
				System.out.println(+a +" Number is Not Prime");
		
	}
public static void main(String[] args) {
	WhileLoop4.primeNum(12);
	WhileLoop4.primeNum(1325);
	WhileLoop4.primeNum(5461);
	WhileLoop4.primeNum(258);
}
}
