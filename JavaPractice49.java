public class JavaPractice49 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
//        int i;
        System.out.println("The first 10 natural numbers are :");
        for (int j = 0; j < 10; j++) {
            System.out.println(j);

        }
        long estimatedTime = System.nanoTime()-startTime;
        System.out.println("Estimated time (in nanosecons) to get the first 10 natural numbers :"+estimatedTime);
    }
}
