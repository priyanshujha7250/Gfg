package Gfg.Inheritance;
class Super{
    public void display(){
        System.out.println("Super class display");
    }
}
class Sub extends Super{
    @Override
    public void display(){
        System.out.println("sub class display");
    }
}
public class q6_methOverRiding{
    public static void main(String[] args) {
        Super s = new Super();
        s.display();
        Sub sb = new Sub();
        sb.display();
        Super sb1 = new Sub(); // isska kya use hai jab kaam chal hi jaa raha hai toh
        sb1.display();
    }
}