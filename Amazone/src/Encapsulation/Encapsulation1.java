package Encapsulation;
class student{
	private String college="xyz";
	public void setcollege(String college) {
		this.college=college;
	}
}
public class Encapsulation1 {
public static void main(String[] args) {
	student s1=new student();
	s1.setcollege("rohit");
//	System.out.println(" student college name: " +setcollege); // as we hv only set college name not getcollege
	System.out.println("bye bye");
}
}
