package AssigPgm;

public class LargestAmongThreeNo {
	static void LargestNo(int a, int b, int c) {
		System.out.println("first no: " +a);
		System.out.println("second no: " +b);
		System.out.println("third no: " +c);
		if(a>=b && b>=c) {
			System.out.println("Largest No is: " +a);
		}
		else if(b>=a && b>=c){
			System.out.println("Largest No is: " +b);
		}
		else {
			System.out.println("Largest No is: " +c);
		}
	}
public static void main(String[] args) {
	LargestAmongThreeNo.LargestNo(60, 30, 90);
	System.out.println("**********************************" );
	LargestAmongThreeNo.LargestNo(100, 500, 300);
}
}
