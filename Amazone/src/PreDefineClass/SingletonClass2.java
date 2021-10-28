package PreDefineClass;
class DemoSingleton{
	int age;
	private DemoSingleton(){
		age=30;
		System.out.println("Age is: " +age);
	}
	static DemoSingleton demo=new DemoSingleton();
	static DemoSingleton getinstance() {
		return demo;
	}
	void print() {
		 System.out.println("I am print() of class DemoSingleton ");
	 }
}
public class SingletonClass2 {
public static void main(String[] args) {
	DemoSingleton d1=DemoSingleton.getinstance();
	d1.print();
	d1.age=50;
	System.out.println("updated age: " +d1.age);
	
}
}
