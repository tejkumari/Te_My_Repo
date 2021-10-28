package assigment1;

public class Pgm2 {
	double multiply(float a, float b) {
		double	res = a*b;
		System.out.println("A: " +a);
		System.out.println("B: " +b);
			System.out.println("Multiplication of A and B: " +res);
		return(res);	
		}
		
		
	public static void main(String[] args) {
		Pgm2 obj = new Pgm2();
		obj.multiply(20 , 5 );

}
}