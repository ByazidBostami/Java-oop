import java.util.Scanner;

public class task9a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        

        int digitCount = countDigits(number);
        System.out.println(number + " has " + digitCount + " digits.");
    }

    public static int countDigits(int number) {
        
        number = Math.abs(number);
        
        
        if (number == 0) {
            return 1;
        }

        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
