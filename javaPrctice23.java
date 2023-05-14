import java.util.Scanner;

public class javaPrctice23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String str = sc.nextLine();
        char c;
        String reverse="";
        for (int i = 0; i < str.length(); i++) {
            c=str.charAt(i);
            reverse = c + reverse;
        }
        System.out.println("Reverse string is S:"+reverse);
    }
}
