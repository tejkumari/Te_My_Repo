package Modifies2;

import Modifies.PrivateMembers;

public class AccessPrivateMembers {

	public static void main(String[] args) {
		
		PrivateMembers p1=new PrivateMembers();
		//System.out.println(p1.accNum);// private members are not accessible outside the class
		//p1.displayAccNum();// private members are not accessible outside the class
	}
}
