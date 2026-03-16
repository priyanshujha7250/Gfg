package Gfg.oops;
class cylinder{
	private double radius;
	private double height;
	public cylinder(double r,double h) {
		radius = r;
		height = h;
	}
	double lidArea(){
        return Math.PI*radius*radius;
    }
    double totalSurfaceArea(){
        return 2*Math.PI*radius*(radius+height);
    }
    double volume(){
        return Math.PI*radius*radius*height;
    }
    double circumfarance(){
        return 2*Math.PI*radius;
    }
}
public class q7Cylinder {
	public static void main(String[] args) {


		cylinder c = new cylinder(7,10);

		System.out.println("area : " + c.lidArea());
		System.out.println("Total surface area : "+c.totalSurfaceArea());
		System.out.println("Volume : " + c.volume());;
		System.out.println("Circumference : " + c.circumfarance());
	}
}
