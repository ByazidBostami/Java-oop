import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of elements: ");
        int N = scanner.nextInt();

        
        int[] array = new int[N];
        System.out.println("Enter " + N + " numbers:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        
        Arrays.sort(array);

        
        double median;
        if (N % 2 == 0) {
            median = (array[N / 2 - 1] + array[N / 2]) / 2.0;
        } else {
            median = array[N / 2];
        }

        
        System.out.println("The median is " + median);

        
    }
}
