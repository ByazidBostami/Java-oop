import java.util.Scanner;

public class task9b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        

        int[] digits = extractDigits(number);
        System.out.print("Encrypted digits: ");
        for (int digit : digits) {
            System.out.print(digit * 7 + " ");
        }
    }

    public static int[] extractDigits(int number) {
        
        number = Math.abs(number);

        int digitCount = countDigits(number);

        int[] digits = new int[digitCount];
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
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
