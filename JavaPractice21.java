import java.util.Scanner;
public class JavaPractice21 {
    public static void main(String[] args) {
        System.out.println("Enter the string :");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String upper_case = "";
        Scanner linescan = new Scanner(str);
        while (linescan.hasNext()) {
            String word = linescan.next();
            upper_case += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        System.out.println(upper_case.trim());
    }

    }

