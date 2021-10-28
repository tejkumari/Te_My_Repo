package assigment1;

public class Ifelse5 {
	void posNegNo(int a) {
		if(a>0){  
			System.out.println("POSITIVE");  
			}else if(a<0){  
			System.out.println("NEGATIVE");  
			}else{  
			System.out.println("ZERO");  
	}
	}
public static void main(String[] args) {
	Ifelse5 obj = new Ifelse5();
	obj.posNegNo(15);
	obj.posNegNo(-5);
	obj.posNegNo(70);
	obj.posNegNo(0);
	obj.posNegNo(77);
	
}
}