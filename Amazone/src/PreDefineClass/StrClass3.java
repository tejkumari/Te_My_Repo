package PreDefineClass;

public class StrClass3 {
public static void main(String[] args) {
	String s1="i am from patna";
	System.out.println("String s1: " +s1);
	String[] strary=s1.split(" ");
	for(String s:strary) {
		System.out.println(s);
	//for(int i=0; i>=strary.length; i++) {
	//System.out.println(strary[i]);	
	}
	System.out.println("***************************");
	String s2="I am from UP";
	System.out.println("Actual String: "+s2);
	String[] strAry2=s2.split(" ", 3);
	for(String s:strAry2) {
		System.out.println(s);
	}
	System.out.println("***************************");
	String s3="I am from Pune";
	String str[]=s3.split(" ");
	String temp="";
//	for(String s:str) {
//		System.out.println(s);
//	}
	for(int i=str.length-1;i>=0;i--) {
		temp=temp+" "+str[i];
	}
	System.out.println(temp.trim());
	
}
}
