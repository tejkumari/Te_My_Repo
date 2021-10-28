package Overriding;
class ABC{
	private void Method() {
		System.out.println("i m Private");
	}
}
public class Overriding4 extends ABC{
public void Method() {
	System.out.println("i m public");
	//super.Method();// compile error: bcz Method of overriding4 class is of higher visibility than ABC class Method
}
public static void main(String[] args) {
	Overriding4 obj=new Overriding4();
	obj.Method();
}

}

