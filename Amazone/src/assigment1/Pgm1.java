package assigment1;

public class Pgm1 {
	int add(int a, int b) {
	int	res=a+b;
	System.out.println("A: " +a);
	System.out.println("B: " +b);
		System.out.println("Addition of A and B: " +res);
	return(res);	
	}
	
	
public static void main(String[] args) {
	Pgm1 obj = new Pgm1();
	obj.add(20, 55);

}
}
