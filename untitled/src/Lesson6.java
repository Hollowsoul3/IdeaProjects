import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args) {
        System.out.println(f1(6));
        try (Scanner sc = new Scanner(System.in)){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();

            f4(a,b);
            System.out.println(f5(a,b,c));

        }
    }
    public static boolean f1(double a) {
        return a > 10;
    }
    public static double f2(double a,double b,double c){
        if (c>0){
            return a+b;
        }
        else {
            return a-b;
        }
    }
    public static double f3(double a,double b,int c){
        if(c>1){
            return a+b;
        }
        else if(c==1){
            return a-b;
        }
        else if(c==0){
            return a*b;
        }
        else{
            return a/b;
        }
    }
    public static void f4(int a, int b){
        if (a>b){
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }
    }
    public static int f5(int a,int b,int c){
        if (a>=b && a>=c){
            return a;
        }
        else if (b>=a && b>=c){
            return b;
        }
        else {
            return c;
        }

    }
}


