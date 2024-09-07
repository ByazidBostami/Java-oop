import java.util.Scanner;
import java.util.ArrayList;

public class ArrayTask5 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the length of the array (N): ");
        int N = scanner.nextInt();
        
        int[] array = new int[N];
        
        System.out.println("Please enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        
        ArrayList<Integer> newArray = new ArrayList<>();
        newArray.add(array[0]);

        int removedCount = 0;
        for (int i = 1; i < N; i++) {
            if (array[i] != array[i - 1]) {
                newArray.add(array[i]);
            } else {
                removedCount++;
            }
        }
        
        System.out.print("New Array: ");
        for (int num : newArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        System.out.println("Removed elements: " + removedCount);
        
        
    }
}
