package AssigPgm;

public class Fabnocci {
	static void FabnociiSecries() {
		int a=0, b=1, c,i;
		System.out.println(a);
		System.out.println(b);
		
		for(i=2; i<=15; i++) {
			
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
			
			
		}
	}
	
	
public static void main(String[] args) {
	Fabnocci.FabnociiSecries();
}
}
