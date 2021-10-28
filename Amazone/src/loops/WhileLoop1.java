package loops;

public class WhileLoop1 {
	static void whileloop() {
		System.out.println("Printing numbers from 1 to 5");
		int i=0;
		while(i <5) {
			System.out.println("Hello " + i);
			i++;
		}
		int a=5;
		while(i>0) {
			System.out.println("bye " + a);
			a--;
		}
	}
public static void main(String[] args) {
	WhileLoop1.whileloop();
}
}
