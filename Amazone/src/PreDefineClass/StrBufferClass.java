package PreDefineClass;

public class StrBufferClass {
public static void main(String[] args) {
	StringBuffer s=new StringBuffer("Hello  ");
	StringBuffer sb=new StringBuffer("Hello  ");
	System.out.println(s.equals(sb));// compare based on address
	System.out.println(s.toString().equals(sb.toString()));// for comparison based on value
	System.out.println(s==sb);// compare based on address
	System.out.println("Original StringBuffer value: "+sb);//Hello 
	sb.append("Java");
	System.out.println(sb);//Hello  Java  
	sb.insert(6, "Pune");
	System.out.println(sb);//Hello Pune Java  
	sb.replace(1, 3, "xxx");
	System.out.println(sb);//Hxxxlo Pune Java  
	sb.delete(1, 3);
	System.out.println(sb);//Hxlo Pune Java  
	System.out.println("*********************************************");
	StringBuffer s1=new StringBuffer("Bangalore is known for IT");
	s1.reverse();  
	System.out.println(s1);//TI rof nwonk si erolagnaB  
	System.out.println("*********************************************");
	StringBuffer s2=new StringBuffer();
	System.out.println(s2.capacity());//default 16  
	s2.append("Hello");  
	System.out.println(s2.capacity());//now 16,as length of hello is less than 16
	s2.append("java is my favourite language");  
	System.out.println(s2.capacity());// now 34: formula applied:(16*2)+2=34 i.e (oldcapacity*2)+2 
	s2.append("I am from automation area");  
	System.out.println(s2.capacity());//now 70: (34*2)+2=70 i.e (oldcapacity*2)+2
}
}
