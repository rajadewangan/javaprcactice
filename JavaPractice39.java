import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class JavaPractice39 {
    public static void main(String[] args) {
        System.out.println("Enter an 5 size of array :");
        int [] a1,r_a1;
        a1=r_a1=new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a1.length; i++) {
            a1[i]=sc.nextInt();

        }
        System.out.println("Original array is :"+ Arrays.toString(a1));
        for (int i = 0; i < a1.length-1; i++) {
            r_a1[i]=a1[i+1];
        }
        r_a1[4]=a1[0];
        System.out.println("Rotated array is :"+Arrays.toString(r_a1));
    }
}
