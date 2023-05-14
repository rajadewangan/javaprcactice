import java.util.Scanner;


public class JavaPractice08 {
    public static void main(String[] args) {
        System.out.println("Enter the value :");

        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int a = (int)c;


        System.out.println("ASCII value of a given character :" + a);
    }
}
