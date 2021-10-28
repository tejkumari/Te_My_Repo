package patternAssigment2;

public class Pattern5 {
public static void main(String[] args) {
	for(int i=1, n=5; i<=n; i++) {
		for(int j=1; j<=i; j++) {
			System.out.print("  ");
		}
		for(int j=i; j<=n; j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
