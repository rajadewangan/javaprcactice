import java.util.Arrays;
import java.util.Scanner;

public class JavaPractice40 {
    public static void main(String[] args) {
        System.out.println("Enter an 5 elements on array :");
        int [] a1 = new int[5];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a1.length; i++) {
            a1[i]=sc.nextInt();
        }
        int l_value = a1[0];
        for (int a:a1) {
            if(a>l_value)
            {
                l_value=a;
            }
        }
        System.out.println("Given array is ;"+ Arrays.toString(a1));
        System.out.println("Biggest element on this array is :"+l_value);

    }
}
