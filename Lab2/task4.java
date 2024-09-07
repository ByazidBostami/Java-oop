import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        int minimum = 0;
        int maxximum = 0;
        int validCount = 0;

        while (count < 10) {
            System.out.println("Enter a number: ");
            int newInput = input.nextInt();

            if (newInput % 2 != 0 && newInput > 0) {
                sum += newInput;
                validCount++;
                if (validCount == 1) {
                    maxximum = newInput;
                    minimum = newInput;
                } else {
                    if (newInput < minimum) {
                        minimum = newInput;
                    }
                    if (newInput > maxximum) {
                        maxximum = newInput;
                    }
                }
            }
            count++;
        }

        if (validCount > 0) {
            double avg = (double) sum / validCount;
            System.out.println("Sum = " + sum);
            System.out.println("Minimum = " + minimum);
            System.out.println("Maximum = " + maxximum);
            System.out.println("Average = " + avg);
        } else {
            System.out.println("No odd positive numbers found");
        }

        
    }
}
