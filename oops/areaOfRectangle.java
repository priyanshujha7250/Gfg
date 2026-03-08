package Gfg.oops;
class rectangle{
    double length;
    double breadth;
    double area(){
        return length*breadth;
    }
    double perimeter(){
        return 2*(length+breadth);
    }
    boolean square(){
        return length == breadth;
    }
}
public class areaOfRectangle {
    public static void main(String[] args) {
        rectangle r = new rectangle();
        r.length = 10;
        r.breadth= 12;
        System.out.println("Area of the rectangle : " + r.area());
        System.out.println("Perimeter of rectangle : " + r.perimeter());
        System.out.println("It is a square : " + r.square());
    }
}