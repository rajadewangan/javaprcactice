import java.io.PrintStream;
import java.util.Scanner;

public class JavaPractice01 {
    public void binary(int sum)
    {
        int n=sum;
        if(sum!=1)





        System.out.print(sum=sum%2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int a;
       int b;
        System.out.println("Enter first number :");
        a= sc.nextInt();
        System.out.println("Enter second number :");
        b= sc.nextInt();
        System.out.println("You have entered :" + a+" , " + b);
        int sum;
        sum = a+b;
      System.out.printf("The binary sum is :");
        JavaPractice01 j=new JavaPractice01();
        j.binary(sum);



    }
}
