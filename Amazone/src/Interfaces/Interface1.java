package Interfaces;
interface i1{
}
interface Drawable{
		void draw();
}
class Rectangle implements Drawable{
	public void draw(){
		System.out.println("drawing rect.");
	}
}
class Circle implements Drawable{
	public void draw() {
		System.out.println("draw circle");
	}
}
public class Interface1 {
public static void main(String[] args) {
	Rectangle r1=new Rectangle();
	r1.draw();
	Circle c1=new Circle();
	c1.draw();
	Drawable d1=new Circle();
	d1.draw();

}
}
