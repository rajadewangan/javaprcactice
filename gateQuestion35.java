public class gateQuestion35 {
    public static void main(String[] args) {
        if(args.length!=1)
        {
            System.out.println("Wrong argument");
        }
        else{
            int n = Integer.parseInt(args[0]);
            int f = 1;
            for (int i = 0; i < n; i++) {
                f=f*i;
            }
            System.out.println("Factorial of "+n+" is "+f);
        }
    }
}
