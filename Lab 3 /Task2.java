import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Enter a string in lowercase letters:");
        String input = scanner.nextLine();
        
        
        String result = PreviousAl(input);
        
        System.out.println(result);
        
        
    }
    
    public static String PreviousAl(String str) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            
            
            if (currentChar == 'a') {
                result.append('z');
            } else {
                result.append((char)(currentChar - 1));
            }
        }
        
        return result.toString();
    }
}
