import java.util.Arrays;
import java.util.Scanner;

public class JavPractice41 {
    public static void main(String[] args) {
        System.out.println("Enter an array :");
        int [] a1 = new int[5];
        int swap;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a1.length; i++) {
            a1[i]=sc.nextInt();

        }

        System.out.println("Given array is :"+ Arrays.toString(a1));
        swap = a1[0];
        a1[0] = a1[4];
        a1[4] = swap;
        System.out.println("Swapped array is :"+Arrays.toString(a1));

    }
}
