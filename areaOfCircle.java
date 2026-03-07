package Gfg;
class circle{
    double radius ;

    double area(){
        return Math.PI*radius*radius;
    }
    double perimeter(){
        return 2*Math.PI*radius;
    }
    double circumference(){
        return perimeter();
    }
}

public class areaOfCircle {
    public static void main(String[] args) {
        circle c = new circle();
        c.radius = 5;
        System.out.println("Area of circle : "+c.area());
        System.out.println("Perimeter of circle : " + c.perimeter());
        System.out.println("Circumference of the circle : " + c.circumference());

    }
    
}
