package ThisKeywordAndMethods;

 class Student1 {
	int rollno=1000001;
	float fee;
	 Student1(int rollno, float fee){
		System.out.println("local rollno : "+rollno);
		System.out.println("local fee : "+fee);
		System.out.println("global rollno : "+this.rollno);
		System.out.println("global fee : "+this.fee);
	 }
	void display()	{
	System.out.println(this.rollno + "      "+ fee);
	}
 }
 class ThisKeyword2{
public static void main(String[] args) {
	Student1 s1 = new Student1(111, 5000f);
	s1.display();
	Student1 s2 = new Student1(112, 6000f);		
	s2.display();

}
}