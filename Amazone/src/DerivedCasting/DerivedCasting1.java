package DerivedCasting;
class GP{
	void myHome() {
		System.out.println("GP home");
	}
}
class Parent extends GP{
	// Function
	void show() {
		// Print message for this class
		System.out.println("Parent show method is called");
	}
	void callme() {
		System.out.println("Parent callme method is called");
	}
}
class Child extends Parent {
	void readme() {
		System.out.println("Child readme method is called");
	}
}
public class DerivedCasting1 {
public static void main(String[] args) {
	Child c1=new Child();
	c1.myHome();
	c1.show();
	c1.callme();
	c1.readme();
	
	Parent p1=new Child(); //auto-up/implicit up casting
	p1.myHome();
	p1.show();
	p1.callme();

	Child c2=new Child();// down-casting
	Parent p2=c2;
	//Parent p2=(Parent)c2;
	p2.myHome();
	p2.show();
	p2.callme();
	
	GP g1=(GP)c2;
	g1.myHome();
	
	Parent p3=c2;
	p3.myHome();
	p3.show();
	p3.callme();
}
}
