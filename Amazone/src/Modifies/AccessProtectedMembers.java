package Modifies;

public class AccessProtectedMembers {

	public static void main(String[] args) {
		
		ProtectedMembers p1=new ProtectedMembers();
		System.out.println("Accessing Protected members from another class within same package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
		Modifiers m=new Modifiers();
		//System.out.println("Private: " +m.num1);// Protected is accessible only within the class in it is declared
		System.out.println("Default: " +m.num2);
		System.out.println("Protected: " +m.num3);
		System.out.println("public: " +m.num4);
	}
}
