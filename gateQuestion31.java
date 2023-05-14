import java.io.BufferedReader;
import java.io.InputStreamReader;
//program to add two matrices
public class gateQuestion31 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i,j,m,n;
        int a[][] = new int[10][10];
        int b[][] = new int[10][10];
        int c[][] = new int[10][10];
        System.out.println("Enter the order of matrix :");
        try{
            m = Integer.parseInt(br.readLine());
            n = Integer.parseInt(br.readLine());
        }
        catch (Exception e)
        {
            m = 3;
            n =3;
            System.out.println(e);
        }
        System.out.println("Enter the first matrix");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                try{
                    a[i][j] = Integer.parseInt(br.readLine());
                }
                catch (Exception e)
                {

                }

            }

        }
        System.out.println("Enter the second matrix");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                try{
                    b[i][j] = Integer.parseInt(br.readLine());
                }
                catch (Exception e)
                {

                }

            }

        }
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {

                    c[i][j] = a[i][j] + b[i][j];

            }

        }
        System.out.println("The first matrix is :");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(a[i][j]+" ");

            }
            System.out.println();

        }
        System.out.println("The second matrix is :");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(b[i][j]+" ");

            }
            System.out.println();

        }
        System.out.println("The addition of given  matrix is :");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(c[i][j]+" ");

            }
            System.out.println();

        }
    }

}
