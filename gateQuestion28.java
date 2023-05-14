import java.io.BufferedReader;
import java.io.InputStreamReader;

public class gateQuestion28 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i,n;
        int a[] = new int[100];
        System.out.println("Enter the value of n");
        try {
            n = Integer.parseInt(br.readLine());
        }
        catch (Exception e)
        {
//            System.out.println(e);
            n=3;
        }
        System.out.println("Enter the values");
        for ( i = 0; i < n; i++) {
            try {
                a[i] = Integer.parseInt(br.readLine());

            }
catch (Exception e)
{
    System.out.println(e);
}
        }
        System.out.println("The values are");
        for (i = 0; i < n; i++) {
            System.out.println(a[i]+" ");
        }
    }
}
