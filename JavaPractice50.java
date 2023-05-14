import java.util.Scanner;

public class JavaPractice50 {
    public static void main(String[] args) {
        System.out.println("Enter an 10 numbers :");
        Scanner sc = new Scanner(System.in);
        int even,odd;
        even = odd = 0;
        int [] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i]=sc.nextInt();

        }
        for (int a:arr
             ) {
            if(a%2==0) {
                even++;
            }
            else
                odd++;
        }
        System.out.println("The even numbers in a given string is :"+even);
        System.out.println("The odd numbers in a given string is :"+odd);

    }
}
