package Gfg;
public class q2{
    public static boolean showNumber(int a){
        int temp = a;
        int b = 0;
        while(temp>0){
            b = b*10 + temp%10;
            temp = temp/10;
        }
        boolean k = false;
        if(a==b){
            k = true;
        }
        return k;//time complexity (theta n)
    }
    public static void main(String[] args) {
        System.out.println(showNumber(363));
    }
}