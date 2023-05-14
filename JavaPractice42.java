import java.util.Arrays;
import java.util.Scanner;

public class JavaPractice42 {
    public static void main(String[] args) {
        System.out.println("Enter 5 elements on first array :");
        int [] a1,a2,m_array;
        Scanner sc = new Scanner(System.in);
        a1=new int[5];
                a2=new int[5];
                m_array=new int[5];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = sc.nextInt();

        }
//        System.out.println("First array :"+ Arrays.toString(a1));
        System.out.println("Enter 5 elements on second array :");
        for (int i = 0; i < a2.length; i++) {
            a2[i] = sc.nextInt();

        }
        for (int i = 0; i < m_array.length; i++) {
            m_array[i]=a1[i]*a2[i];

        }
        System.out.println("First array :"+ Arrays.toString(a1));
        System.out.println("second array :"+ Arrays.toString(a2));
        System.out.println("Multiplied  array :"+ Arrays.toString(m_array));

    }
}
