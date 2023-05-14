import java.util.ArrayList;
import java.util.Scanner;

// To print unique numbers
/* 123
   12
   13
   21
   23
   31
   32
 */
public class JavaPractice05 {

    public static void main(String[] args) {
        System.out.println("How many numbers to print unique numbers ");
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int c;
        ArrayList<Integer> a = new ArrayList<>();
        System.out.println("Enter the numbers :");
        for(int i=0;i<num;i++) {
            c= sc.nextInt();
            a.add(i,c);

        }
        System.out.println("Enter how many digit combination");
        int x= sc.nextInt();
        int amount =0;
        int i,j,k;
        if(x<=num) {
            for (int l = 0; l < num; l++) {

                JavaPractice05 java = new JavaPractice05();
                //java(l,a,x);

            }

                /*for (int m = 0; m < x; m++) {
                    if(l!=m) {
                        System.out.print(a.get(l));
                        System.out.println(a.get(m));
                        System.out.println();
                    }*/
        }
        else {
            System.out.println("Digits should be less than or equal to given numbers !");
        }
       /* for(i=0;i<num;i++)
        {
            for(j=0;j<num;j++)
            {
                for(k=0;k<num;k++)
                {
                    if(a.get(i)!=a.get(j)&&a.get(j)!=a.get(k)&&a.get(k)!=a.get(i))
                    {
                        System.out.print(a.get(i));
                        System.out.print(a.get(j));
                        System.out.print(a.get(k));
                        amount++;
                        System.out.println();
                    }
                }
            }*/
        }
       // System.out.println("The total numbers of pairs is :" + amount);
    }

