package Constructor;
class A{
	int i=10;
	A(){
		System.out.println("Runnung const A");
	}
	void display() {
		System.out.println("Running display method class A " +i);
	}
}
class B{
		int j=10;
		B(){
			System.out.println("Runnung const B");
		}	
		void display() {
			System.out.println("Running display method class B " +j);
		}
}

public class Cons5 {
	void display() {
		System.out.println("Running display method class Cons5");
	}

public static void main(String[] args) {
	System.out.println("Running Main method");
	A c1 = new A();
	c1.display();
	B c2 = new B();
	c2.display();
}
}
