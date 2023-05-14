import java.util.Arrays;
import java.util.Scanner;

public class JavaPractice43 {
    public static void main(String[] args) {
        System.out.println("Enter an number :");
        int [] a,b;
        a=b=new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i]= sc.nextInt();
        }
//        a=sc.nextInt();
        System.out.println(Arrays.toString(b));
    }
}
