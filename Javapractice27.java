import java.util.Scanner;

public class Javapractice27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str = sc.nextLine();
        String last_three = str.substring(str.length()-3);
        for (int i = 0; i < 3; i++) {
            System.out.println(last_three);
        }
    }
}
