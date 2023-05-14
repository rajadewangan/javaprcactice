import java.util.Scanner;

public class JavaPractice30 {
    public static void main(String[] args) {
        System.out.println("Enter first string :");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        System.out.println("Enter second string :");
        String s2 = sc.next();
        System.out.println(s1.substring(1)+s2.substring(1));
    }
}
