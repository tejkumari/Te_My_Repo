package assigment1;

public class Pgm5 {
	 int swap() {
		 int a= 5;
		 int b=10;
		 System.out.println("Before swaping");
		 System.out.println("value of a: " +a);
			System.out.println("value of b: " +b);
			a = a ^ b;  
			b = a ^ b;
			a = a ^ b;  
			 System.out.println("After swaping");
			System.out.println("value of a: " +a);
			System.out.println("value of b: " +b);
		return 0;
	}
public static void main(String[] args) {
	Pgm5 obj = new Pgm5();
	obj.swap();
}
}
