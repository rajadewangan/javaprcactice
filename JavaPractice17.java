import java.util.Scanner;

public class JavaPractice17 {
    boolean chk ( int a, int b , int c)
    {
        boolean bln;
        bln = ( a<b&&b<c);
        return bln;
    }
    public static void main(String[] args) {
        System.out.println("Enter three numbers :");
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();
        JavaPractice17 java = new JavaPractice17();
        System.out.println(java.chk(a,b,c));
    }
}
