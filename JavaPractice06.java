import java.util.ArrayList;
import java.util.Scanner;
// To print unique numbers
/*    123
   12
   13
   21
   23
   31
   32


   1234
   123
   124
   234
   231
   341
   342
   134

 */

public class JavaPractice06 {
    public void printnum(int q,ArrayList<Integer> a)
    {
        int amount =0;
        try {
        for (int i = 0; i <= q; i++)
        {
                for (int k = 0; k <= q; k++) {
                    System.out.print(a.get(k));
                    for (int j = q-1; j <= q; j++) {
                        if (j != k) {
                            System.out.print(a.get(j));
                            System.out.println();
                            if (j < q) {
                                System.out.print(a.get(k));
                            }
                            amount++;
                        }
                    }

               }

        }
        }
        catch (Exception e)
        {
            System.out.println("Can't Print");
        }
        System.out.println("The number combinations :" + amount);
    }
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

        JavaPractice06 java = new JavaPractice06();
        if(x<=num) {
            java.printnum(x,a);
        }
        else {
            System.out.println("Digits should be less than or equal to given numbers !");
        }
    }
}
