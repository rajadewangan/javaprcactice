import java.util.Scanner;

public class JavaPractice24 {
    void pn(){
        System.out.println("Enter three numbers :");
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();
        if(a>=20||b>=20||c>=20){
            if(a-b<c||b-a>c){
                System.out.println("true"+ c);
            }
            if(b-c>a||c-b>a){
                System.out.println("true"+ a);
            }
            if(a-c>b||c-a>b){
                System.out.println("true"+b);
            }
        }
    }
    public static void main(String[] args) {
        JavaPractice24 java = new JavaPractice24();
        java.pn();
    }
}
