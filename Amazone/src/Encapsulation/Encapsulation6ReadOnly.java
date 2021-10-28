package Encapsulation;
class Student2{
	private String college="TSTTC";

	public String getCollege() {
		return college;
	}
	
}
public class Encapsulation6ReadOnly {
public static void main(String[] args) {
	Student2 s1=new Student2();
	System.out.println(s1.getCollege());
	
}
}
