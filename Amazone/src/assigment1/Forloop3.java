package assigment1;

public class Forloop3 {
	void dispSum(int num) {
		int a, sum=0;
		System.out.println("natural no: " +num);
		for( a=1; a<=num; a++) {
			sum = sum + a;
			
			System.out.println(+ a +"  Sum of natural no: " +sum);
}
	}
	public static void main(String[] args) {
		Forloop3 obj = new Forloop3();
		obj.dispSum(5);
		obj.dispSum(10);
}
}
