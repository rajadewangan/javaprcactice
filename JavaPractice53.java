import java.util.Scanner;

public class JavaPractice53 {
    public static void main(String[] args) {
        System.out.print("Enter the number of elements in the array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.printf("Enter %d elements of the array:%n", n);
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int numDuplicates = 0;
        int[] duplicates = new int[n];  // stores the duplicated values
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    boolean alreadyCounted = false;
                    for (int k = 0; k < numDuplicates; k++) {
                        if (arr[i] == duplicates[k]) {
                            alreadyCounted = true;
                            break;
                        }
                    }
                    if (!alreadyCounted) {
                        duplicates[numDuplicates] = arr[i];
                        numDuplicates++;
                    }
                    break;
                }
            }
        }
        System.out.printf("There are %d unique duplicated values in the array:%n", numDuplicates);
        for (int i = 0; i < numDuplicates; i++) {
            System.out.print(duplicates[i] + " ");
        }
        System.out.println();
    }
}
