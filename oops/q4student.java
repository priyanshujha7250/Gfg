package Gfg.oops;
class StudentTest{
    int roll_no;
    String name;
    String course;
    double m1;
    double m2;
    double m3;
    double total(){
        return m1+m2+m3;
    }
    double average(){
        return total()/3;
    }
    String grade(){
        if(average()>=70){
            return ("Name : "+name + ", Roll no :"+roll_no + ", Course : " + course+", Grade : " +" A");
        }
        else if(average()<70 && average()>=60){
            return ("Name : "+name + ", Roll no :"+roll_no + ", Course : " + course+", Grade : " +" B");
        }
        else if(average()<60 && average()>=50){
            return ("Name : "+name + ", Roll no :"+roll_no + ", Course : " + course+", Grade : " +" C");
        }
        else if(average()<50 && average()>=40){
            return ("Name : "+name + ", Roll no :"+roll_no + ", Course : " + course+", Grade : " +" D");
        }
        else{
            return ("Name : "+name + ", Roll no :"+roll_no + ", Course : " + course+", Grade : " +" F");
        }
    }
}
public class q4student {
    public static void main(String[] args) {
        StudentTest s = new StudentTest();
        s.roll_no = 23;
        s.name = "Priyanshu";
        s.course= "B.Tech-(cse)";
        s.m1=88;
        s.m2=98;
        s.m3=70;
        System.out.println("Total marks : " + s.total());
        System.out.println("Average marks " + s.average());
        System.out.println(s.grade());
    }
}
