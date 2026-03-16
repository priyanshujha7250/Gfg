package Gfg.oops;
class Rectangle{
    private double length;
    private double breadth;
    Rectangle(){
        length = 1.0;
        breadth = 1.0;
    }
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
public class q6areaUsingConstructor {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println("Area of the rectangle : " + r.area());
        System.out.println("Perimeter of rectangle : " + r.perimeter());
        System.out.println("It is a square : " + r.square());
    }
}