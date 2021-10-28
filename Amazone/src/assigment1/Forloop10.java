package assigment1;

public class Forloop10{
void factor(int a) {
	System.out.println("Factors of " + a + " are:" ); 
	if (a>0) {
	for(int i =1; i<= a; i++) {
		if (a % i==0) { 
			System.out.println(i + " " );
		}
	}
	}
		else if(a<0){
            for (int i = -1; i >= a; i--) {
                if (a % i == 0) {
                	System.out.println(i + " " );
                    }
                }
		}
}
public static void main(String[] args) {
	Forloop10 obj = new Forloop10();
	obj.factor(76);
	obj.factor(-10);
}
}
