package assigment1;

public class Forloop7 {
int reverse() {
	int num= -19501;
	System.out.println("Number is: " + num);
	int rev=0;
	for(;num!=0; num=num/10) {
		int rem = num % 10;
		rev= rev * 10 + rem;
		//System.out.println("Reverse of number is: " +rev);
	}
	System.out.println("Reverse of Number is: " +rev);
	return (rev);
	
}
public static void main(String[] args) {
	Forloop7 obj =new Forloop7();
	obj.reverse();
}
}

