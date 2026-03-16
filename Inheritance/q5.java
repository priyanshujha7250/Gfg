package Gfg.Inheritance;
class Rectangle{
    int length;
    int breadth;
    public Rectangle(int l,int b){
        this.length=l;
        this.breadth=b;
    }
    public void display(){
        System.out.println("Length : "+length);
        System.out.println("Breadth : " + breadth);
    }
}
public class q5{
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10,20);
        r.display();
    }
}