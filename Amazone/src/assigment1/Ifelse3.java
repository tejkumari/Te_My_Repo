package assigment1;

public class Ifelse3 {
	static void largestNo(int a, int b, int c) {
		System.out.println("Value of a: " +a);
		System.out.println("Value of b: " +b);
		System.out.println("Value of c: " +c);
		if (a >= b && b >= c )
			System.out.println(a +" is largest no");
		else if (b >= a && b >= c )
			System.out.println(a +" is largest no");
		else
			System.out.println(c +" is largest no");
		return;
	}
	
	
	
public static void main(String[] args) {
	Ifelse3.largestNo(17, 15, 19);
}
}
