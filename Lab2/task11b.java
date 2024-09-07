import java.util.Scanner;

public class task11b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the triangle: ");
        int size = scanner.nextInt();
        scanner.close();

        printTrianglePattern(size);
    }

    public static void printTrianglePattern(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
