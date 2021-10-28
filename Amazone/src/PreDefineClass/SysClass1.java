package PreDefineClass;
import java.io.Console;
import java.util.Currency;
import java.util.Locale;
public class SysClass1 {
public static void main(String[] args) {
System.out.println("System user dir: " +System.getProperty("user.dir"));//used to get system Dir
System.out.println("System user dir: " +System.getProperty(" "));
System.out.println("Current Working Dir: "+System.getProperty("user.dir"));
System.clearProperty("user.home");// use to clean ppty(Dir)
System.out.println(System.getProperty("user.home"));// null bcz ppty has been cleaned by cleanProperty()
System.out.println("System user dir: " +System.getProperty("user.dir"));
System.out.println(System.getProperty("user.country"));//Us
System.out.println("other than system property: "+System.getProperty("user.password", "none of your business"));
System.out.println("current time in milli: "+System.currentTimeMillis());
System.out.println("current time in nano: " +System.nanoTime());
System.out.println(System.getenv("user.dir"));
System.out.println(System.class);
System.out.println(System.class.hashCode());
System.out.println(System.out);
System.out.println(System.err);
System.out.println(System.in);
}
}
