package day8Methods;

public class Area {
	int a = 10;
	static int b = 5;
	
	public static void areaOfTrangle() {
		Area obj = new Area();
		double areaT= 0.5 * obj.a * Area.b;
		System.out.println("Area of Traingle: " +areaT);
	}
	
	public double areaOfCircle( int r) {
		//Area obj1 = new Area();
		double areaC= 3.14 *r * r;
		return(areaC);
	}
	
	static double areaOfRectangle() {
		Area obj3= new Area();
		double areaR= obj3.a*b;
		return (areaR);
	}
	
	public static void Square() {
		Area obj5 = new Area();
		obj5.a = 1000;
		double areaS = obj5.a * obj5.a;
		System.out.println("Area of Square: " +areaS);
		return;
	}
	public static void main(String[] args) {
		
		Area.areaOfTrangle();
		
		Area obj2 = new Area();
		double res= obj2.areaOfCircle(5);
		System.out.println("Area of Circle: " + res);
		
		Area.b=70;
		double res2 = Area.areaOfRectangle();
		System.out.println("Area of Rectangle: " +res2);
		
		Area.Square();

	}

}
