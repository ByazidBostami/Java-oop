import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Enter the first word:");
        String word1 = scanner.nextLine();
        
        
        System.out.println("Enter the second word:");
        String word2 = scanner.nextLine();
        
        
        String concatenated = word1 + " " + word2;
        
        
        int sum = calAscii(concatenated);
        
       
        System.out.println(concatenated);
        System.out.println(sum);
        
        
    }
    
    public static int calAscii(String str) {
        int sum = 0;
        

        for (char ch : str.toCharArray()) {
            
            sum += (int) ch;
        }
        
        return sum;
    }
}
