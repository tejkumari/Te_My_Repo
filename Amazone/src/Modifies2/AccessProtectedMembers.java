package Modifies2;

import Modifies.ProtectedMembers;

public class AccessProtectedMembers extends ProtectedMembers {
public static void main(String[] args) {
		
		AccessProtectedMembers p1=new AccessProtectedMembers();
		System.out.println("Accessing Protected members from another class outside of package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
