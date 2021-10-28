package ThisKeywordAndMethods;
class Thisabc{
	Thisabc() {
		this(5);
		System.out.println("hello a");
	}
	Thisabc(int x) {
		System.out.println(x);
	}
	void display() {
		System.out.println("This is ThisMethod");
	}
}
public class ThisMethod2 {
public static void main(String[] args) {
	Thisabc abc=new Thisabc(10);
	abc.display();
}
}
