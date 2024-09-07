import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        
        if (isPalindrome(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
        
        
    }
    
    public static boolean isPalindrome(String str) {
        
        str = str.toLowerCase();
        

        int length = str.length();
        
        
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        
        return true;
    }
}
