package DerivedCasting;
class JD {
	public void printMe1() {
		System.out.println("JournalDev print method");
	}
	void disp() {
		System.out.println("JournalDev disp method");
	}
}
class Java extends JD {
	public void printMe2() {
		System.out.println("Java print method");
	}
	void disp() {
		System.out.println("Java disp method");
	}
}
class Android extends Java {
	public void printMe3() {
		System.out.println("Android print method");
	}
	void disp() {
		System.out.println("Android disp method");
	}
}
public class DerivedCasting3 {
public static void main(String[] args) {
	System.out.println("************implict-upcasting**********************");	
	JD j1=new Android();//implict-upcasting
	j1.printMe1();
	j1.disp(); //android
System.out.println("***********down-castin***********************");	
	Java j2=(Java)j1;//down-casting   j2-->j1-->obj of android class
	j2.printMe1();
	j2.disp(); //java
	j2.printMe2();
	System.out.println("*************explict up-casting*********************");		
	Android a1=(Android)j1;// explict up-casting
	a1.printMe1();
	a1.disp(); //anroid
	a1.printMe2();
	a1.printMe3();
}
}
