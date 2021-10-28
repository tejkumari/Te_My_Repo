package day8Methods;

public class Method6 {
	static int average(int x, int y, int z) {
		System.out.println("Value of X: " +x);
		System.out.println("Value of Y: " +y);
		System.out.println("Value of Z: "+z);
		int avg=(x+y+z)/3;
		System.out.println("Average is: " +avg);
		return(avg);
	}

	public static void main(String[] args) {
		Method6.average(55,41,66);
		
		
	}
}
