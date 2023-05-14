import java.util.Scanner;

public class JavaPractice20 {
    void divisiblebynumber(){
        System.out.println("Enter the range :");
        int a,b;
        Scanner sc = new Scanner (System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        for (int i = a; i < b; i++) {
            if(i%n==0){
                System.out.println(i);
                System.out.println();
            }
        }
    }
public static  void main(String args[]){
    JavaPractice20 java = new JavaPractice20();
    java.divisiblebynumber();
    }
}
