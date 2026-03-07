package Gfg;
public class q1 {
    public static void main(String[] args) {
        int a = 1545;
        int j = 0;
        for( ; a>0; ){
            j++;
            a=a/10;
        }
        System.out.println("Number of digits : " + j);//time complexity (theta n)
    }
}
