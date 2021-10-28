package ThisKeywordAndMethods;
class Alpha {
	void M() {
		//System.out.println("Print M" this.);
	}
	Alpha(int a){
		int m=a + 5;
		System.out.println("Running cost.: " +a);
		System.out.println("Running cost.: " +m);
	}
	void N() {
		System.out.println("Print N");
		this.M();
	}
}
public class ThisKeyword4 {
	void methodOne() {
		System.out.println("Inside Method ONE");
	}
	void methodTwo() {
		System.out.println("Inside Method TWO");
		this.methodOne();
	}
public static void main(String[] args) {
	ThisKeyword4 obj = new ThisKeyword4();
	obj.methodTwo();
	Alpha obj2 = new Alpha(500);
	obj2.N();
}
}
