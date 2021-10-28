package Constructor;

class A1{
	int i=50;
	A1(){
		System.out.println("Running class A cons " +i);
		i= 100;
	}
}
 class B1{
	 int j=50;
		B1(){
			System.out.println("Running class B cons " +j);
			j= 100;
 }
 }

public class Cons7 {
public static void main(String[] args) {
	A1 obj = new A1();
	System.out.println("Running class A cons " +obj.i);
	B1 obj1 = new B1();
	System.out.println("Running class B cons " +obj1.j);
}
}
