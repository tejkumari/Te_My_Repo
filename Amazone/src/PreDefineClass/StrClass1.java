package PreDefineClass;

public class StrClass1 {
public static void main(String[] args) {
	StrClass1 s=new StrClass1();
	System.out.println("String class Object s: " +s);
	
	String s1="Mumbai";//Obj In str constant-pool & str non-constant-pool
	String s2="Mumbai";//Obj In non-constant-pool,bcz constant-pool allow only unique objects
	String s3="Delhi";//Obj In str constant-pool & str non-constant-pool
	
	System.out.println("String Class object s1: " +s1);
	System.out.println("String Class object s2: " +s2);
	System.out.println("String Class object s3: " +s3);
	System.out.println("Character count in String Class object s1: " +s1.length());
	System.out.println("Character count in String Class object s3: " +s3.length());
	System.out.println("Compare String Class s1 & s2 objects based on value: " +s1.equals(s2));
	System.out.println("Compare String Class s1 & s3 objects based on value: " +s1.equals(s3));
	System.out.println("Compare String Class s1 & s3 objects based on address: " +(s1==s3));
	System.out.println("Compare String Class s1 & s2 objects based on address: " +(s1==s2));
	System.out.println("String Class object s1: " +s1);
	
	String s4=new String("Mumbai");// 2 obcts one in string const-pool & other in string non-cons-pool
	System.out.println("s4: "+s4);
	System.out.println("s1 & s4 using equals(): "+s1.equals(s4));//compare s1 and s4 values --> true
	System.out.println("s1 & s4 using '==': "+(s1==s4));//compare s1 & s4 based on address --> false
	
	String s5=new String("Mumbai");//two objects--> 1. in constant pool 2. in non-constant pool
	System.out.println("s5: "+s5);
	System.out.println("s4 & s5 using equals(): "+s4.equals(s5));//compare s5 and s4 values --> true
	System.out.println("s4 & s5 using '==': "+(s4==s5));//compare s5 & s4 based on address --> false
	System.out.println(s4.toString());
	System.out.println(s4.equals(s3));
	System.out.println(s4.equals(s1));
	System.out.println(s4.hashCode());
	System.out.println(s1.hashCode());
	System.out.println(s3.hashCode());
	
	
}
}
