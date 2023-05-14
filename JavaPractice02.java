import java.util.Scanner;

public class JavaPractice02 {
    public static void main(String[] args) {
        System.out.println("Enter First Number");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        System.out.println("Enter second number :");
        float b = sc.nextFloat();
        if(a>b)
        {
            System.out.println(a + " > "+b);
        } else if (a<b) {
            System.out.println(a + " < "+b);

        }
        else
        {
            System.out.println(a + " = "+b);
        }
    }
}
