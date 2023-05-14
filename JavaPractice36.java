import java.util.Arrays;
import java.util.Scanner;

public class JavaPractice36 {
    public static void main(String[] args) {
        System.out.println("Enter two arrays :");
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter first array :");
        int [] a1,a2;
        a1=new int[3];
        a2=new int[3];
        for (int a:a1
             )
            a = sc.nextInt();
        System.out.println("Enter second array :");
        for (int a:a2
        ) {
            a=sc.nextInt();

        }
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));

        int [] a3={a1[0],a2[2]};
        try {



            System.out.println(Arrays.toString(a3));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
