package Abstraction;
abstract class Animal1{
	public abstract void animalSound();
	public final void sleep() {
		System.out.println("Zzzzzzz");
	}
	static void display2() {
		System.out.println("I m a non-abstract display2() in Animal1 class");
	}
}
class Pig1 extends Animal1{
	public void animalSound() {
		System.out.println("The pig saya : weeeeeee weeeeeeee");
	}

	/*
	 * *********we cann't override final methods************** static void
	 * public final void sleep() { System.out.println("Huuuuuzzzzzzz"); }
	 */	
	public final void sleep(int a) {
		System.out.println("Huuuuuzzzzzzz" +a);
	}
	static void display2() {
		System.out.println("I m a non-abstract display2() in Pig class");
	}
	/*
	 * *********we cann't overload static methods************** static void
	 * display2(int a) {
	 * System.out.println("I m a non-abstract display2() in Pig class" +a); }
	 */
}




public class AbstractClass3 {
public static void main(String[] args) {
	Pig1 p1=new Pig1();
	p1.animalSound();
	p1.sleep();
	Pig1.display2();
	
	Animal1 a1=(Animal1)p1;
	a1.sleep();
	Animal1.display2();
	
}
}
