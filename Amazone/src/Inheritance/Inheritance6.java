package Inheritance;
class GrandFather{
	GrandFather(){
		System.out.println("i m class grandfather const.");
	}
	void myHome() {
		System.out.println("i m home of grandfather");
	}
}
class Father extends GrandFather{
	Father(double d){
		super();
		System.out.println("i m class father const.");
	}
	void mycar() {
		System.out.println("i m car of father");
		super.myHome();
	}
}
class Child extends Father{
	Child(int i){
		super(12.2);
		System.out.println("i m class child const.");
	}
	void mybike() {
		System.out.println("i m bike of child");
		super.mycar();
		super.myHome();
	}
}
public class Inheritance6 {
public static void main(String[] args) {
	System.out.println("*********Pgm Starts*****************");
	Child c1=new Child(21);
	c1.myHome();
	c1.mycar();
	c1.mybike();
	Father f1=new Child(10);
	f1.myHome();
	f1.mycar();
	GrandFather g1=new Child(28);
	g1.myHome();
	GrandFather g2=new Father(64.78);
	g2.myHome();
	System.out.println("**********Pgm Ends****************");
}
}
