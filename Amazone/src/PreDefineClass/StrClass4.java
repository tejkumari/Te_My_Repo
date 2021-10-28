package PreDefineClass;

public class StrClass4 {
private static final String S = null;

public static void main(String[] args) {
String s1="CoreJaveBasics";
System.out.println(s1.length());//14
System.out.println(s1.charAt(3));//e
//Return string from given index to end
System.out.println(s1.substring(3));//eJaveBasics
//Return string between given index
System.out.println(s1.substring(4, 8));//Jave

String s2="Core";
String s3="JaveBasics";
System.out.println(s2);
System.out.println(s2.concat(s3));
System.out.println(s2);

String s4 = "Learn Share Learn Share";
System.out.println(s4);
System.out.println(s4.length());
System.out.println(s4.indexOf("share"));
System.out.println(s4.indexOf('s', 3));
System.out.println(s4.indexOf('S', 15));
System.out.println(s4.lastIndexOf("Share"));
System.out.println(s4.lastIndexOf('S', 10));

String s6="Selenium";
String s7="selenium";
String s8="Selenium";
System.out.println(s6.equals(s7));//false-->not same value(caseSensitive)
System.out.println(s6.equals(s8));// true--> same value
System.out.println(s7.equals(s8));//false-->not same value(caseSensitive)
System.out.println(s7.equalsIgnoreCase(s8));//True--> ignore caseSensitivity
	
String word1 = "CoreJavaBasics";	
System.out.println(word1.toUpperCase());
System.out.println(word1.toLowerCase());
String str1=word1.replace('a', 'X');
System.out.println(str1);
String str2=word1.replace("Java", "Net");
System.out.println(str2);
String str3=word1.replace("java", "Net");
System.out.println(str3);//CoreJavaBasics-->JVM not find 'java' in obj(word1) is caseSensitive
String str4=word1.replace("a", "XXX");
System.out.println(str4);

String word2 = "   Learn Share Learn   ";
System.out.println(word2.trim());// trim space after and before string
	
String str5=" ";
System.out.println("str5 is empty or not: "+str5.isEmpty());	
String str6="";
System.out.println("str6 is empty or not: "+str6.isEmpty());
}
}
