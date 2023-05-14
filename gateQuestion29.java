import java.io.BufferedReader;
import java.io.InputStreamReader;

public class gateQuestion29 {
    public static void main(String[] args) {
        int n;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of terms :");
        try{
            n = Integer.parseInt(br.readLine());
        }
        catch (Exception e)
        {
            System.out.println("Exception 1");
            n = 3;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();

        }

    }
}
