package AssigPgm;

public class SumOfNno {
static void SumOfNnaturalNo(int n) {
	int sum=0;
	sum=n*(n+1)/2;
		System.out.println("Sum of first " +n +" Natural no: " +sum);
	}

public static void main(String[] args) {
	SumOfNno.SumOfNnaturalNo(10);
	System.out.println("***********************************************");
	SumOfNno.SumOfNnaturalNo(50);
}
}
