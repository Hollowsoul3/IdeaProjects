import java.util.Scanner;

public class Lesson72 {
    public static void main(String[] args) {
        int b;
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            while (a > 0 && a < 20) {
                System.out.println("Programist");
                a--;
            }
        }
    }
}
