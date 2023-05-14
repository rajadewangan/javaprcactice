import java.util.Scanner;

public class JavaPractice18 {
    public boolean righmost(int a, int b, int c)
    {
        boolean by;

          while(a/10>=10) {
              a /= 10;
          }
        while(b/10>=10)
        {
            b /= 10;
        }
        while(c/10>=10)
        {
        c /= 10;
        }
        if(a==b||b==c||a==c)
            by=true;
           else
               by = false;
           return  by;
    }
    public static void main(String[] args) {
        System.out.println("Enter three numbers :");
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();
        JavaPractice18 java = new JavaPractice18();

        System.out.println(java.righmost(a,b,c));
    }
}
