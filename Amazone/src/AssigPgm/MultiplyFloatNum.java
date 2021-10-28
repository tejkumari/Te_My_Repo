package AssigPgm;

public class MultiplyFloatNum {
	MultiplyFloatNum(int a, int b){
	System.out.println("Value of A: " +a);
	System.out.println("Value of B: " +b);
	}
	double MultfloatNum() {
		int a=40, b=26;
//		a= this.a;
//		b=this.b;
		System.out.println("Value of A: " +a);
		System.out.println("Value of B: " +b);
		double mult=a*b;
		System.out.println("Multiplication of A and B: " +mult);
		return mult;
	}
public static void main(String[] args) {
	MultiplyFloatNum obj=new MultiplyFloatNum(50, 77);
	obj.MultfloatNum();
}
}
