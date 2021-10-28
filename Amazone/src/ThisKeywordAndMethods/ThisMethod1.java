package ThisKeywordAndMethods;
class ThisMe{
	ThisMe() {	
		this(25.36);
		System.out.println("hello zero");
	}
	ThisMe(double d) {
		this(15);
		System.out.println("hello double " + d);
	}
	ThisMe(int x) {
		System.out.println("Hello int " + x);
	}
}

public class ThisMethod1 {
public static void main(String[] args) {
	ThisMe t1=new ThisMe();
}
}
