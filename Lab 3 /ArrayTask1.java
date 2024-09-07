import java.util.Scanner;
import java.util.ArrayList;

public class ArrayTask1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("N=");
        int N = scanner.nextInt();
        
        
        int[] array = new int[N];
        
        
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        
        
        System.out.print("Enter the element to remove: ");
        int removeElement = scanner.nextInt();
        
        
        System.out.print("Input array: ");
        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
        
        ArrayList<Integer> newArrayList = new ArrayList<>();
        
        
        boolean elementFound = false;
        
        
        for (int i = 0; i < N; i++) {
            if (array[i] != removeElement) {
                newArrayList.add(array[i]);
            } else {
                elementFound = true;
            }
        }
        
        if (elementFound) {
          
            int[] newArray = newArrayList.stream().mapToInt(Integer::intValue).toArray();
            
            
            System.out.print("New array: ");
            for (int i : newArray) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            
            System.out.println("Element not found");
        }
        
        
    }
}
