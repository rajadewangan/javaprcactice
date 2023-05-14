import java.util.Scanner;

public class JavaPractice32 {
    public static void main(String[] args) {
        System.out.println("Enter first string :");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        System.out.println("Enter second string :");
        String s2 = sc.next();
        System.out.println(s1.substring(0)+s2.substring(s2.length()-1));
    }
}
