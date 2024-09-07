import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrayTask4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements (N): ");
        int N = scanner.nextInt();

        int[] array = new int[N];

        System.out.println("Enter " + N + " elements:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        Map<Integer, Integer> occurrences = new HashMap<>();

        for (int num : array) {
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
        }

       
    }
}
