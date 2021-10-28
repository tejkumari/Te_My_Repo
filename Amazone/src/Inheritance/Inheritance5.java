package Inheritance;
class fruit{
	fruit(){
		System.out.println("fruit class const. ");
	}
	public void taste() {
		System.out.println("fruits are sweet");
	}
}
class apple extends fruit{
	apple(){
		System.out.println("apple class const.");
	}
	public void shape() {
		System.out.println("apple is round");
	}
}

public class Inheritance5 {
public static void main(String[] args) {
	apple fr=new apple();
	fr.taste();
	fr.shape();
}
}
