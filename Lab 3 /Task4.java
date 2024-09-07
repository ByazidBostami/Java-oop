import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            
            String input = scanner.nextLine();
            
            Set<Character> uniqueChars = new HashSet<>();
            boolean hasDuplicate = false;
            StringBuilder errorM = new StringBuilder();
            
            for (char ch : input.toCharArray()) {
                if (uniqueChars.contains(ch)) {
                    if (errorM.length() == 0) {
                        errorM.append("\"").append(ch).append("\" has been counted 2 times in the word \"").append(input).append("\".");
                    } else {
                        errorM.append("\n\"").append(ch).append("\" has been counted 2 times in the word \"").append(input).append("\".");
                    }
                    hasDuplicate = true;
                } else {
                    uniqueChars.add(ch);
                }
            }
            
            if (hasDuplicate) {
                System.out.println(errorM.toString());
                System.out.println("Please enter another word.");
            } else {
                System.out.println("You entered " + input + ".");
                break;
            }
        }
        
        
    }
}
