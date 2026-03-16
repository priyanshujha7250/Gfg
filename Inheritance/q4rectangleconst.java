// class Rectangle{
//     int length;
//     int breadth;
//     public Rectangle(){
//         length = breadth = 1;
//     }
//     public Rectangle(int length,int breadth){
//         this.length = length;
//         this.breadth = breadth;
//     }
//     public double area(){
//         return length*length;
//     }
// }
// class cuboid extends Rectangle{
//     int height;
//     public cuboid(){
//         height = 1;
//     }
//     public cuboid(int height){
//         this.height=height;
//     }
//     public cuboid(int length,int breadth,int h){
//         super(length,breadth);
//         height = h;
//     }
//     public double volume(){
//         return length*breadth*height;
//     }
// }
// public class q4rectangleconst{
//     public static void main(String[] args) {
//         cuboid c1 = new cuboid();
//         cuboid c2 = new cuboid(10);
//         cuboid c3 = new cuboid(3,5,10);
//         System.out.println(c1.volume());
//         System.out.println(c2.volume());
//         System.out.println(c3.volume());
//     }
// }
package Gfg.Inheritance;
class Rectangle{
    int length;
    int breadth;
    int x = 10;
    public Rectangle(){
        length = breadth = 1;
    }
    public Rectangle(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    double area(){
        return 20*22;
    }
}
class cuboid extends Rectangle{
    int height;
    int x = 11;
    public cuboid(int length,int breadth,int h){
        super(length,breadth);
        height = h;
    }
    public void display(){
        System.out.println(super.x);
        System.out.println(x);
        System.out.println(area());
    }

}
public class q4rectangleconst{
    public static void main(String[] args) {
        cuboid c = new cuboid(2,3,4);
        c.display();
    }
}
