import java.util.Scanner;

public class ArrayTask3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();
        
        int[] array = new int[length];
        
        System.out.println("Enter " + length + " elements:");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < length / 2; i++) {
            int temp = array[i];
            array[i] = array[length - 1 - i];
            array[length - 1 - i] = temp;
        }
        
        
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
        
    }
}
