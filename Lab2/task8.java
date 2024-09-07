import java.util.Scanner;

public class task8 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        
        
        
        int start = Math.min(num1, num2);
        int end = Math.max(num1, num2);
        
        int primeCount = countPrimesBetween(start, end);
        System.out.println("There are " + primeCount + " prime numbers between " + start + " and " + end + ".");
    }
    
    public static int countPrimesBetween(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }
    
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
