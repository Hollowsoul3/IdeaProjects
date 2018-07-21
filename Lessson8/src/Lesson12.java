public class Lesson12 {
    public static void main(String[] args) {
        int[] A = new int[4];
        A[0] = 100;
        A[1] = 150;
        A[2] = 250;
        A[3] = 200;
        System.out.println((double) arraySum(A) / arrayCount(A));
        printArray(A);
        arrayDecrease(A, 50);
        printArray(A);
        arrayIncrease(A, 50);
        printArray(A);

    }

    public static int arraySum(int[] A) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        return sum;
    }

    public static int arrayCount(int[] A) {
        int a = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != 0) {
                a++;
            }
        }
        return a;
    }

    public static void printArray(int[] A) {
        System.out.print("[");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + ",");
        }
        System.out.println("]");
    }

    public static void arrayDecrease(int[] A, int decreaseValue) {
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] - decreaseValue;
        }
    }

    public static void arrayIncrease(int[] A, int increaseValue) {
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] + increaseValue;
        }
    }
}
