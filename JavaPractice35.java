import java.util.Scanner;

public class JavaPractice35 {
    public static void main(String[] args) {
        System.out.println("Enter two arrays :");
        Scanner sc = new Scanner(System.in);
        int[] a1 = new int[3],a2 = new int[3];
        for (int a: a1) {
            a= sc.nextInt();
        }
        for (int a: a2) {
            a= sc.nextInt();
        }
        System.out.println(a1[0]==a2[0]);
    }
}
