import java.util.Scanner;

public class JavaPractice19 {
    public void time()
    {
        System.out.println("Enter the seconds :");
        Scanner sc = new Scanner(System.in);
        int h=0;

        int m=0;
          int s=sc.nextInt();
            if(s/3600>0)
            {
                h=s%3600;
                s/=3600;
            }
            if(s/60>0)
            {
                m=s%60;
                s/=60;
            }
        System.out.println("Hours :"+ h +"\nMinutes :"+m+"\nSeconds :"+s);
    }

    public static void main(String[] args) {
        JavaPractice19 java = new JavaPractice19();
        java.time();

    }
}
