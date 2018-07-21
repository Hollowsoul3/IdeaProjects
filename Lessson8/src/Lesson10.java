import java.util.Random;
import java.util.Scanner;

public class Lesson10 {
    public static void main(String[] args) {

        int[] A=randomArray(5,10);
        printArray(A);
        System.out.println(arraySum(A));
        System.out.println(arrayMax(A));
        System.out.println(arrayMin(A));
        System.out.println(arrayFind(A,5));
        printArray(reverseArray(A));


    }
    /*
    public static int[] inputArray() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите количество элементов: ");
            int N = sc.nextInt();
            int[] arr=new int[N];
            for(int i=0;i<arr.length;i++){
                System.out.println("Введите элемент массива "+i+":");
                int a= sc.nextInt();
                arr[i]=a;
            }
            return arr;
        }
    }
    */
    public static int[] randomArray(int N, int bound){
            Random rn=new Random();
            int[] arr=new int[N];
            for(int i=0;i<arr.length;i++){
                arr[i]=rn.nextInt(bound);
            }
            return arr;
    }
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println("Эллемент массива "+i+": "+arr[i]);
        }
    }
    public static int arraySum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static int arrayMax(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int arrayMin(int[] arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static boolean arrayFind(int[] arr, int value){
        for(int i=0;i<arr.length;i++){
            if(value==arr[i]){
                return true;
            }
        }
        return false;
    }
    public static int[] reverseArray(int[] arr){
        int[] arr2=new int[arr.length];
        for(int i=0;i<arr.length;i++){
           arr2[i]=arr[arr.length-i-1];
        }
        return arr2;
    }


}