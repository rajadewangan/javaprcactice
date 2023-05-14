import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class JavaPractice38 {

    public static void main(String[] args) {
        System.out.println("Enter an 5 size of array :");
        int [] a = new int[5];
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <a.length; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
        for (int a1: a
             ) {
            if(a1==4||a1==7)
            {
                flag = 1;
            }

        }
        System.out.println(flag==1);
    }
}
