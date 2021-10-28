package operators;
/**
 * pre: first perform the operation dn use the updated value 
 * post: first use the value dn perform the operation
 */
public class Unary1 {
	public static void main(String[] args) {
		int a=10;
		int b=a;
		System.out.println("a: " + a); //10
		System.out.println("b: " + b);//10
		System.out.println("*************************** " );
		
		int k=++a;// a=a+1---> 10+1=11---> a=11 k=a=11
		System.out.println("k: " + k); //11
		System.out.println("a: " + a); //11
		System.out.println("b: " + b); //10
		System.out.println("*************************** " );
		
		int j=++k; //k=k+1---> 11+1=12--->k=12 j=k=12
		System.out.println("k: " + k); //12
		System.out.println("a: " + a); //11
		System.out.println("b: " + b); //10
		System.out.println("j: " + j); //12
		System.out.println("*************************** " );
		
		int r=a;
		System.out.println("r=: " + r++);//11
		System.out.println("r=: " + r);//12
		System.out.println("r=: " + ++r);//13
		System.out.println("r=: " + r);//13
		System.out.println("*************************** " );
		
		int x = r;
		System.out.println("x=: " + --x);// 16
		System.out.println("x=: " + x);// 16
		System.out.println("x=: " + x--);// 16
		System.out.println("x=: " + x);// 15
		System.out.println("*************************** " );
		
		int x1 = j;
		System.out.println("x=: " + --x1);// 11
		System.out.println("x=: " + x1);// 11
		System.out.println("x=: " + x1--);// 11
		System.out.println("x=: " + x1);// 10
		System.out.println("*************************** " );
}
}