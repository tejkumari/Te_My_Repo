package assigment1;

public class Forloop8 {
	void palindrom(String str) {
		System.out.println("String: " +str);  
		String rev ="";
		int length = str.length();
		
		for(int i = length-1; i>=0; i--)
		 rev = rev + str.charAt(i);
		
		if (str.equals(rev))
			System.out.println("Palindrome String: " +str); 
		else
			System.out.println("Not Palindrome String: " +str); 
	}
public static void main(String[] args) {
	Forloop8 obj = new Forloop8();
	obj.palindrom("kssk");
	obj.palindrom("gfdsjgfsj");
}
}
