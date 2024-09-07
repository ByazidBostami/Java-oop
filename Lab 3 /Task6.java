import java.util.Scanner;

public class Task6 {
    
    public static String rmCon(String input) {
        if (input == null || input.length() == 0) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        result.append(input.charAt(0));

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) != input.charAt(i - 1)) {
                result.append(input.charAt(i));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        
        String output = rmCon(input);
        System.out.println("Output: " + output);
        
        
    }
}
