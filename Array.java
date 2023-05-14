public class Array
{
    public static void main(String[] args) {
        int month_days[];
        month_days = new int[12];
        int cnt = 0;
        for (int a:month_days
             ) {
            if(cnt%2==0)
            {
                month_days[cnt]=31;
            }
            else {

                month_days[cnt]=30;
            }
            cnt++;
        }
        for (int a:month_days
             ) {
            System.out.println(a);

        }

    }
}
