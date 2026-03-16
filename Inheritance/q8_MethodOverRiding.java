package Gfg.Inheritance;
class TV{
    void SwitchOn(){
        System.out.println("Tv is switched on");
    }
    void ChangeChannel(){
        System.out.println("Tv channel is changed");
    }
}
class SmartTv extends TV{
    void SwitchOn(){
        System.out.println("Smart tv is switched on");
    }
    void ChangeChannel(){
        System.out.println("Smart Tv channel is changed");
    }
    void browse(){
        System.out.println("Smart tv is browsing");
    }
}
public class q8_MethodOverRiding{
    public static void main(String[] args) {
        TV t = new SmartTv();
        t.SwitchOn();
        t.ChangeChannel();
    }
}