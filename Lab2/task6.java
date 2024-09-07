import java.util.Scanner;
import java.util.InputMismatchException;

public class task6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[5];
        double[] weights = new double[5];
        double weightedSum = 0;
        double weightSum = 0;

        for (int i = 0; i < 5; i++) {
            boolean validInput = false;
            while (!validInput) {
                try {
                    System.out.println("Enter number " + (i + 1) + ": ");
                    numbers[i] = input.nextDouble();
                    System.out.println("Enter weight for number " + (i + 1) + ": ");
                    weights[i] = input.nextDouble();
                    validInput = true;  
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a decimal number.");
                    input.next();  
                }
            }
        }

        
        for (int i = 0; i < 5; i++) {
            weightedSum += numbers[i] * weights[i];
            weightSum += weights[i];
        }

        
        double weightedAverage = weightedSum / weightSum;

        
        System.out.println("Weighted Average = " + weightedAverage);

        
    }
}
