import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class gateQuestion30 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i,n,j,t;
        int a[] = new int[100];
        System.out.println("Ente the number of inputs :");
        try {
            n = Integer.parseInt(br.readLine());
        }
        catch (Exception e)
        {
            n = 3;
        }
        System.out.println("Enter the values :");
        for ( i = 0; i < n; i++) {
            try{
                a[i]= Integer.parseInt(br.readLine());
            }
            catch (Exception e)
            {
                System.out.println( e);
            }

        }
        for ( i = 0; i < n; i++) {
            for (j = i+1; j < n; j++) {
                if(a[i]>a[j])
                {
                    t = a[i];
                    a[i] = a[j];
                    a[j]=t;
                }
            }

        }
        System.out.println("After sorting :");
        for (i = 0; i < n; i++) {
            System.out.print(a[i]+" ");

        }
    }
}
