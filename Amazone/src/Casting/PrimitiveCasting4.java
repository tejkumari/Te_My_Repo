package Casting;
class Sample1
{
    double test1()
    {
        System.out.println("Running test1");
        return 4;//auto widening
    }  
    void test1(double d)//double d=7;
    {
        System.out.println("d value="+d);
    }
}
public class PrimitiveCasting4 {
public static void main(String[] args) {
	  System.out.println("Program starts");
      Sample1 s=new Sample1();
      //explicit narrowing
      int res=(int)s.test1();
      System.out.println("raturn value="+res);
      System.out.println("Program ends");
      s.test1(7);
      System.out.println("Program ends");         
}
}
