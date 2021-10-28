package patternAssigment2;

public class Pattern6 {
	public static void main(String[] args) {
		for(int i=0; i<=5; i++) {
			int a=65;
			for(int j=0; j<=i; j++) {
				System.out.print((char)(a+i) + " ");
			}
			System.out.println();
		}
	}
}
