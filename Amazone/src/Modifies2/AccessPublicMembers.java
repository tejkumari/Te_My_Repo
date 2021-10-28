package Modifies2;

public class AccessPublicMembers {

	public static void main(String[] args) {
		//using fully qualified class name: packagename.classname
		Modifies.PublicMembers p1=new Modifies.PublicMembers();
		System.out.println("Accessing Default members from another class outside package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
