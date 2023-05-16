public class gateQuestion33 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 100; i < 201; i++) {
            if(i%7==0)
            {
                sum++;
                count++;
            }
        }
        System.out.println("Number of integers= "+count);
        System.out.println("Sum of Integers ="+sum);
    }
}
