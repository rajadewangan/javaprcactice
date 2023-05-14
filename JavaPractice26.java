import java.util.Scanner;
public class JavaPractice26 {

    public static void main(String[] args) {
        System.out.println("Enter a string :");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char [] c=new char[3];
        for (int i = str.length()-1; i>str.length()-4; i--) {
           c[str.length()-i] = str.charAt(i);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(c[i]);
        }
    }
}
