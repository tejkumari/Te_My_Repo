package Overriding;
class ABC1{
	public void Method() {
		System.out.println("i m ABC class method");
	}
}
public class Overriding5 extends ABC1{
	public void Method() {
		System.out.println("i m Overriding5 class method");
		//super.Method();
	}
	public static void main(String[] args) {
		Overriding5 obj=new Overriding5();
		obj.Method();
	}
}
