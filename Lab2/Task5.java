import java.util.*;

public class Task5 {
    public static void main(String[] args) {

        int sum = 0;
        double avg = 0;
        int maximum = 0;
        int minimum = 0;
        int count = 0;
        int count2 = 0;
        Scanner input = new Scanner(System.in);

        while (true) {
            int user = input.nextInt();
            count++;

            if (user == 0) {
                count2++;
            } else {
                count2 = 0;
            }

            if (count2 == 3) {
                break;
            }

            sum += user;
            avg = 1.0 * sum / count;

            if (count == 1) {
                maximum = user;
                minimum = user;
            } else {
                if (user > maximum) {
                    maximum = user;
                }
                if (user < minimum && user != 0) {
                    minimum = user;
                }
            }
        }

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
        System.out.println("Minimum = " + minimum);
        System.out.println("Maximum = " + maximum);

        input.close();
    }
}
