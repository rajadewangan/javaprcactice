import java.util.Scanner;

public class JavaPractice34 {
    public static void main(String[] args) {
        System.out.println("Enter an array of 5 integers :");
        Scanner sc = new Scanner(System.in);
        int [] a= new int[5];
        for (int i = 0; i < 5; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println(a[0]==a[4]);
    }
}
