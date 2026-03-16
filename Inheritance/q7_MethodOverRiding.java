package Gfg.Inheritance;
class Super{
    void display(){
        System.out.println("Hello");
    }
}
class Sub extends Super{
    void display(){
        System.out.println("Hello world");
    }
}
public class q7_MethodOverRiding{
    public static void main(String[] args) {
        Super c = new Sub();
        c.display();
    }
}