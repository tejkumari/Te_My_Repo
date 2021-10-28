package PreDefineClass;

public class SysClass2  extends Object{
public static void main(String[] args) {
	CurrentTime();
	SystemLineSeprator();
	SystemGetProperty();
	SystemIdentityHashCode();
}
public static void SystemLineSeprator() {
	String s="Sysytem"+System.lineSeparator()+"Line";
	System.out.println(s);
}
public static void SystemGetProperty() {
	System.out.println(System.getProperty("user.dir"));
	System.out.println(System.getProperty("user.home"));
	System.out.println(System.getProperties());
	System.out.println(System.getProperty("user.name"));
}
public static void CurrentTime() {
	System.out.println(System.currentTimeMillis());
	System.out.println(System.nanoTime());
}
public static void SystemIdentityHashCode() {
	Object o=new Object();
	String s=new String();
	System.out.println(System.identityHashCode(o));
	System.out.println(System.identityHashCode(s));
	System.out.println(o.equals(s));
	System.out.println(o.equals(o));
	System.out.println(s.equals(o));
	System.out.println(o.hashCode());
	System.out.println(s.hashCode());
	System.out.println(o.toString());
	System.out.println(s.toString());
	System.out.println(s.indexOf(s));
	System.out.println(s.toCharArray());
}
}
