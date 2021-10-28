package PreDefineClass;
class SingletonClass3Demo{
static SingletonClass3Demo demo=new SingletonClass3Demo();
String name;
int age;
private SingletonClass3Demo() {
		name="Tej";
		age=25;
	}
static SingletonClass3Demo getinstance() {
return demo;
}
void Display() {
	System.out.println("Name: "+name) ;
	System.out.println("Age: "+age) ;
}
}
public class SingletonClass3 {
public static void main(String[] args) {
SingletonClass3Demo d=SingletonClass3Demo.getinstance();
	d.Display();
	d.age= 23;
	d.name="Tej kumari";
	d.Display();
SingletonClass3Demo d1=SingletonClass3Demo.getinstance();
	d1.Display();
	d1.name="Tej kumari Prasad";
	d1.age=27;
	d1.Display();
}
}
