import java.util.Scanner;

public class JavaPractice31 {
    public static void main(String[] args) {
        System.out.println("Enter a string :");
        Scanner sc = new Scanner(System.in);
        String s1= sc.next();
        if(s1.length()>=3)
        {
            System.out.println(s1.substring(0,3));
        }

    }
}
