public class gateQuestion38 {
    static void fun(int n){
        if(n>0){
            fun(n/10);
            System.out.println(n%10+" ");
        }
    }
    public static void main(String[] args) {
        int n = 2358;
        System.out.println("Digits are : ");
        fun(n);
    }
}
