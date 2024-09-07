import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an amount of money: ");
        int amount = scanner.nextInt();
        

        calculateNotes(amount);
    }

    public static void calculateNotes(int amount) {
        int[] notes = {500, 100, 50, 10, 5, 1};
        int[] count = new int[notes.length];

        for (int i = 0; i < notes.length; i++) {
            while (amount >= notes[i]) {
                amount -= notes[i];
                count[i]++;
            }
        }

        for (int i = 0; i < notes.length; i++) {
            if (count[i] != 0) {
                System.out.println(count[i] + " " + notes[i] + "’s note");
            }
        }
    }
}
