package Overriding;
class Parent {
	 void show() {
		System.out.println("Parent's show()");
	}
}
class Child extends Parent {
	// This method overrides show() of Parent
	@Override
	 void show() {
		System.out.println("Child's show()");
		//super.show();
	}
}
public class Overriding6 {
	public static void main(String[] args) {
//		Parent obj=new Parent();
//		obj.show();
		Parent obj2=new Child();
		obj2.show();
	}
}
