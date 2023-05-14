import java.util.Scanner;

public class JavaPractice15 {
    public static void main(String[] args) {
        String s = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string value :");
        s = sc.nextLine();
        int a = Integer.parseInt(s);
        System.out.println(a);
    }
}
