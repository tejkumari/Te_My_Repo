package assigment1;

public class Ifelse1 {
	static int evenOdd(int a) {
		if (a%2==0)
			System.out.println(+a +" : is EVEN Number");
		else
			System.out.println(+a +" : is ODD Number");
		return 0;
	}
	
	
public static void main(String[] args) {
	Ifelse1.evenOdd(15);
	Ifelse1.evenOdd(18);
	Ifelse1.evenOdd(93);
	Ifelse1.evenOdd(100);
}
}
