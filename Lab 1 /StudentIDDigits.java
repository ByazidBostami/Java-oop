import java.util.Scanner;

public class StudentIDDigits {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their student ID
        System.out.print("Enter your student ID: ");
        String studentID = scanner.nextLine();

        // Validate the input to ensure it is long enough
        if (studentID.length() < 2) {
            System.out.println("Invalid student ID. It should be at least 2 digits long.");
            return;
        }

        // Get the two rightmost digits
        char secondLastDigit = studentID.charAt(studentID.length() - 2);
        char lastDigit = studentID.charAt(studentID.length() - 1);

        // Print the two digits in reverse order
        System.out.println("The rightmost digits in reverse order are: " + lastDigit + ", " + secondLastDigit);
    }
}
