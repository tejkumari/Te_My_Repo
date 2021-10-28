package PreDefineClass;

import java.util.Scanner;

public class StrClass2 {
	static String reverseString(String str) {
		String temp="";
		for(int i=str.length()-1; i>=0; i--) {
			temp=temp+str.charAt(i);
		}
		System.out.println("Reverse String: " +temp);
		return temp;
	}
	
	static void palinString(String str) {
		String s1= str;
		String temp="";
		for(int i=str.length()-1; i>=0; i--) {
			temp=temp+str.charAt(i);
		}
		if(temp.equals(s1)) {
			System.out.println("String is palindrom: " +temp);
		}else {
			System.out.println("String is not palindrom: " + s1);
		}
	}
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	String s2;
	System.out.println("Enter string");
	s2=scn.next();
	reverseString(s2);
	palinString(s2);
	scn.close();
	/*
	 * Scanner scn1=new Scanner(System.in); String s3;
	 * System.out.println("Enter string to check reverseString"); s3=scn1.next();
	 * reverseString(s3); scn1.close();
	 */
}
}
