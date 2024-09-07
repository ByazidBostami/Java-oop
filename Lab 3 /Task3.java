import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Enter a single-word string:");
        String input = scanner.nextLine();
        
        
        Subs(input);
        
        
    }
    
    public static void Subs(String str) {
        
        for (int i = 1; i <= str.length(); i++) {

            System.out.println(str.substring(0, i));
        }
    }
}
