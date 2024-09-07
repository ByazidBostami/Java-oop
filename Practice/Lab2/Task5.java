import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;
        double avg = 0;
        int count = 0;
        int count2 = 0;
        
        Scanner input = new Scanner(System.in);
        
        while (count2 < 3) {
            int inp = input.nextInt();
            if (inp == 0) {
                count2++;
            } else {
                sum += inp;
                count++;
                if (inp > max) {
                    max = inp;
                }
                if (inp < mini) {
                    mini = inp;
                }
                count2 = 0;
            }
        }
        
        if (count > 0) {
            avg = (double) sum / count;
            System.out.println("Sum = " + sum);
            System.out.println("Minimum = " + mini);
            System.out.println("Maximum = " + max);
            System.out.println("Average = " + avg);
        } else {
            System.out.println("No Numbers found");
        }
        
        input.close();
    }
}
