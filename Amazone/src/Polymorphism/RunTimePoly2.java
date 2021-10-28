package Polymorphism;
class Hillstations {
	void location() {
		System.out.println("Location is:");
	}
	void famousfor() {
		System.out.println("Famous for:");
	}
}
class Manali extends Hillstations {
	void location() {
		System.out.println("Manali is in Himachal Pradesh");
	}
	void famousfor() {
		System.out.println("It is Famous for Hadimba Temple and adventure sports");
	}
}
class Mussoorie extends Hillstations {
	void location() {
		System.out.println("Mussoorie is in Uttarakhand");
	}
	void famousfor() {
		System.out.println("It is Famous for education institutions");
	}
}
class Gulmarg extends Hillstations {
	void location() {
		System.out.println("Gulmarg is in J&amp;K");
	}
	void famousfor() {
		System.out.println("It is Famous for skiing");
	}
}
public class RunTimePoly2 {
public static void main(String args[]) {
		
		Hillstations A = new Hillstations();
		A.location();//location is
		A.famousfor();//famous for
		
		Hillstations M = new Manali();
		M.location();//manali is in himachal
		M.famousfor();// Famous for Hadimba Temple and adventure sports

		Hillstations Mu = new Mussoorie();
		Mu.location();//Mussoorie is in Uttarakhand
		Mu.famousfor();//It is Famous for education institutions
		
		Hillstations G = new Gulmarg();
		G.location();//Gulmarg is in J&amp;K
		G.famousfor();//It is Famous for skiing
	}
}
