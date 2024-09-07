import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;
        double avg = 0;
        int count = 0;
        boolean validInput = false;

        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
            int inp = input.nextInt();
            if (inp > 0 && inp % 2 != 0) {
                sum += inp;
                count++;
                if (inp > max) {
                    max = inp;
                }
                if (inp < mini) {
                    mini = inp;
                }
                validInput = true;
            } else {
                System.out.println("No odd Positive Number");
            }
        }
        
        if (validInput) {
            avg = (double) sum / count;
            System.out.println("Sum = " + sum);
            System.out.println("Minimum = " + mini);
            System.out.println("Maximum = " + max);
            System.out.println("Average = " + avg);
        } else {
            System.out.println("No valid odd positive numbers were entered.");
        }
        
        
    }
}
