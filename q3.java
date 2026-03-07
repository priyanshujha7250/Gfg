package Gfg;
public class q3{
    int factorial(int a){
        int n = 1;
        while(a>0){
            n = n*(a--);  //time copmlexity theta n;
        }
        return n;
    }
    public static void main(String[] args) {
        q3 obj = new q3();
        System.out.println(obj.factorial(6));
    }
}