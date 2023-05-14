import java.util.Scanner;

public class JavaPractice16 {
    boolean pn(int a,int b, int c)
    {
        boolean bln;
        System.out.println("The sum of first two digits is :" + (a+b));
        System.out.println();
        bln = (c==a+b);
            return bln;


    }
    public static void main(String[] args) {

        System.out.println("Enter three numbers :");
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();
        JavaPractice16 java = new JavaPractice16();

        System.out.println( java.pn(a,b,c));
    }
}
