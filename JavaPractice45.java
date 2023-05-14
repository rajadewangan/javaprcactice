import java.util.Scanner;

public class JavaPractice45 {
    public static void main(String[] args) {
        System.out.println("Enter a string :");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Enter a character");
        char a = sc.next().charAt(0);
//        b=s.charAt(0);
        System.out.println(s.charAt(0)==a);

    }
}
