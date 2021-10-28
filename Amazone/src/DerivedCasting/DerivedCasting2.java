package DerivedCasting;
class Member {
	String name;
	long phone;
	void chat() {
		System.out.println(name + " : chatting in whatsapp group");
	}
}
class Admin extends Member {
	void addUser() {
		System.out.println(name + " : adding a new user in whatsapp group");
	}
}
public class DerivedCasting2 {
public static void main(String[] args) {
	Member m1=new Admin();//implicit up-casting
	m1.name="Tej";
	m1.phone=423698512l;
	System.out.println(m1.name);
	System.out.println(m1.phone);
	m1.chat();
	
	Admin ad = (Admin) m1;// down-casting
	ad.name="Rohit";
	ad.phone=917523684;
	System.out.println(ad.name);
	System.out.println(ad.phone);
	ad.chat();
	ad.addUser();
}
}
