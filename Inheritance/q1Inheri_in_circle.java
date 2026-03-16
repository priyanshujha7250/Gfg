package Gfg.Inheritance;

class circle{
	private double radius;
	public circle() {
		radius = 7;
	}
	public double area() {
		return Math.PI*radius*radius;
	}
	public double perimeter() {
		return 2*Math.PI*radius;
	}
	public double getRadius() {
		return radius;
	}
}	
class cylinder extends circle{
	private double height;
	public cylinder(){
		height = 10;
	}
	public double volume() {
		return (2*Math.PI*getRadius()*(height+getRadius()));
	}
}
public class q1Inheri_in_circle {
	public static void main(String[] args) {
		circle c1 = new circle();
		cylinder c2 = new cylinder();
		System.out.println(c1.area());
		System.out.println(c1.perimeter());
		System.out.println(c2.volume());
	}

}
