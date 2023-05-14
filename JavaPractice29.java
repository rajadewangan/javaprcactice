import java.util.Scanner;

public class JavaPractice29 {
    public static void main(String[] args) {
        System.out.println("Enter first string :");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.println("Enter second string :");
        String s2 = sc.nextLine();
        if(s1.length()<=s2.length())
        {
            System.out.println(s1+s2+s1);
        }
        else {
            System.out.println(s2+s1+s2);
        }

    }
}
