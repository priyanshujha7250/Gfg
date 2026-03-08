package Gfg.oops;
class cylinder{
    double radius;
    double height;
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
public class areaOfSphere {
    public static void main(String[] args) {
        cylinder c = new cylinder();
        c.radius = 7;
        c.height = 10;
        System.out.println("Lid area of the cylinder : "+c.lidArea());
        System.out.println("Surface area of the cylinder : "+c.totalSurfaceArea());
        System.out.println("Volume of thr cylinder : "+c.volume());
        System.out.println("Circumference of the cylinder : " + c.circumfarance());
    }
}
