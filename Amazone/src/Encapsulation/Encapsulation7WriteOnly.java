package Encapsulation;
class Student3{
	private String college="TSTTC";

	public void setCollege(String college) {
		this.college = college;
	}
}
public class Encapsulation7WriteOnly {
public static void main(String[] args) {
	Student3 s1=new Student3();
	//System.out.println( "College name: " +s1.setCollege("Modern College"));
	s1.setCollege("Modern College");
	System.out.println("Bye");
}
}
