public class JavaPracice15 {
    public static void main(String[] args) {
        System.out.println("Printing the numbers between 1 to 100 which are divisible by 3, 5 and both");
        System.out.println("Number which are divided by 3 :");
        for (int i = 3; i < 100; i++) {
            if(i%3==0)
                System.out.print(i+",");

        }
        System.out.println("\nNumber which are divided by 5 :");

        for (int i =5; i < 100; i++) {
            if(i%5==0)
                System.out.print(i+",");

        }
        System.out.println("\nNumber which are divided by 3,5 :");

        for (int i = 5; i < 100; i++) {
            if(i%3 == 0 && i%5 == 0)
                System.out.print(i+",");
        }
    }
}
