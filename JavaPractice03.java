import java.util.Scanner;

public class JavaPractice03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("The string is :" + s);
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        System.out.println(" Printing string in a reverse order : \n" + sb.reverse());


    }
}
