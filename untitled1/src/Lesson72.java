import java.util.Scanner;

public class Lesson72 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {


            /*
            int a = sc.nextInt();
            while (a > 0 && a < 20) {
                System.out.println("Programist");
                a--;
            }
             */

            /*
            do {
                a = sc.nextInt();
            } while (a != 0);
            System.out.println("Goodbye");
            */
            int a, b, res=1;
            a = sc.nextInt();
            b = sc.nextInt();
            for(;b>0;b--){
                res=res*a;
            }
            System.out.println(res);
        }
    }
}