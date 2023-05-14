import java.util.Scanner;

public class JavaPractice28 {
    public static void main(String[] args) {
        System.out.println("Enter a string :");
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        System.out.println(s.substring(0,(s.length())/2));
    }
}
