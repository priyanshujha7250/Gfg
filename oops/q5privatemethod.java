package Gfg.oops;
class rectangle{
    private double length;
    private double breadth;
    public double getLength(){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }
    public void setLength(double l){
        length = l;
    }
    public void setBreadth(double b){
        breadth = b;
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
public class q5privatemethod {
    public static void main(String[] args) {
        rectangle r = new rectangle();
        r.setLength(2.5);
        r.setBreadth(5.5);
        System.out.println("Area of the rectangle : " + r.area());
        System.out.println("Perimeter of rectangle : " + r.perimeter());
        System.out.println("It is a square : " + r.square());
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());
    }
}
