package Modifies;

public class AccessPrivateMembers {

	public static void main(String[] args) {
		
		PrivateMembers p1=new PrivateMembers();
		System.out.println("AccessPrivateMembers");
		System.out.println(p1.accNum);
		p1.displayAccNum();
		Modifiers m=new Modifiers();
		//System.out.println("Private: " +m.num1);// Protected is accessible only within the class in it is declared
		System.out.println("Default: " +m.num2);
		System.out.println("Protected: " +m.num3);
		System.out.println("public: " +m.num4);
	}
}
