import java.util.Scanner;

public class JavaPractice14
{
    public static void main(String[] args) {
        System.out.println("Enter the number :");
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a%2==0)
            System.out.println("Number is even");
        else
            System.out.println("Number is odd");

    }
}