import java.util.Scanner;

public class task7b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int limit = scanner.nextInt();
      

        int num1 = 1, num2 = 1;
        int sum = num1 + num2;
        
        System.out.print( limit );
        
        
        System.out.print(num1 + " " + num2 + " ");
        
        int nextNum = num1 + num2;
        while (nextNum <= limit) {
            System.out.print(nextNum + " ");
            sum += nextNum;
            num1 = num2;
            num2 = nextNum;
            nextNum = num1 + num2;
        }

        System.out.println("\nSum = " + sum);
    }
}
