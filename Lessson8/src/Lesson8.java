import java.util.Scanner;

public class Lesson8 {
    public static void main(String[] args) {
        System.out.println(arifSum(1,1,10));

        /*
         Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(func(a));
         */

        /*
        int A=1, B=11;
        for(int i=1; i<10; i++){
            for (int j=1; j<10; j++){
                System.out.println(i + " * " + j + " " + " = " + i*j);
            }
            System.out.println();
        }
        */


/*
        for(int b=-1;b<6;b++) {
            System.out.println(func(b));
        }
    }
    public static int func(int a) {
        switch (a) {
            case 1:
                a++;
                break;
            case 2:
                a = a * 2;
                break;
            case 3:
                a = a * 4;
                break;
            case 4:
                a = a / 2;
                break;
            default:
                a = 0;
                break;
        }
        return a;
    }

        for (int a = 1; a < 101; a++) {
            if (a % 3 == 0) {
                System.out.println(a + " делится на 3");
            }
            if (a % 5 == 0) {
                System.out.println(a + " делатся на 5");
            }
        }
        */

    }
    public static int arifSum(int a1,int d,int n){
        int sum=0;
        for(int i = 0, a=a1;i<=n;i++,a+=d){
            sum=sum+a;
            System.out.println(sum);
        }
        return sum;
    }
}