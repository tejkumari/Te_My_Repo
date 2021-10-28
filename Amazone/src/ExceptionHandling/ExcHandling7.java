package ExceptionHandling;
class UsrDefExceptn extends Exception{
	UsrDefExceptn(String a){
		super(a);
	}
}
public class ExcHandling7 {
public static void main(String[] args) {
	try {
		throw new UsrDefExceptn("This is UserDefined Exception");
	}
	catch(UsrDefExceptn ude) {
		System.out.println("Ude def Excetion: " +ude);
	}
}
}
