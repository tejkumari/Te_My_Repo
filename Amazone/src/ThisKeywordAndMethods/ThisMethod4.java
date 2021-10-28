package ThisKeywordAndMethods;

public class ThisMethod4 {
	int rollno;
	float fee;
	ThisMethod4(int rollno) {
		this.rollno = rollno;	
	}
	ThisMethod4(int rollno, float fee) {
		this(rollno);// C.T.Error
		this.fee = fee;		
	}
	void display() {
		System.out.println(rollno + " " + fee);
	}
}
class ThisStatement4 {
	public static void main(String args[]) {
		ThisMethod4 s1 = new ThisMethod4(111);//rollno --->111 fee--->0.0
		ThisMethod4 s2 = new ThisMethod4(112, 6000f);//rollno--->112 fee--->6000.0
		s1.display();//111 0.0
		s2.display();//112 6000.0
	}
}
