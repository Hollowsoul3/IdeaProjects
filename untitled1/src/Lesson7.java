import java.util.Scanner;

public class Lesson7 {
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("input a: ");
            int a = sc.nextInt();
            System.out.print("input b: ");
            int b = sc.nextInt();
            System.out.print("input c: ");
            int c = sc.nextInt();
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        }
    }

}
