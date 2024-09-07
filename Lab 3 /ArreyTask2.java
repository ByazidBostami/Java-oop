import java.util.Scanner;

public class ArreyTask2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        final int SIZE = 5;
        int[] array = new int[SIZE];
        
       
        System.out.println("Enter " + SIZE + " numbers:");
        for (int i = 0; i < SIZE; i++) {
            array[i] = scanner.nextInt();
        }
        
       
        int smallest = array[0];
        int largest = array[0];
        int smallestIndex = 0;
        int largestIndex = 0;
        
        
        for (int i = 1; i < SIZE; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                smallestIndex = i;
            }
            if (array[i] > largest) {
                largest = array[i];
                largestIndex = i;
            }
        }
        
       
        System.out.println("The largest number " + largest + " was found at location " + largestIndex + ".");
        System.out.println("The smallest number " + smallest + " was found at location " + smallestIndex + ".");
        
        
    }
}
