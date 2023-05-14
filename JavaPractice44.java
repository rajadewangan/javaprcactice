import java.util.Scanner;

public class JavaPractice44 {
    public static void main(String[] args) {
        System.out.println("Enter a string :");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s.substring(s.length()-4)+s+s.substring(s.length()-4));
    }
}
