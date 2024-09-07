import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int user = inp.nextInt();

        if (user % 2 == 0 && user % 5 == 0) {
            System.out.println("Multiple of 2 and 5 both");
        }
        else if (user%2!=0 && user%5!=0){
            System.out.println("Not a Multiple of 2 and 5 both ");
        }

        else if (user%2==0 && user%5!=0){
            System.out.println(user);
        }

        else if (user%2!=0 && user%5==0){
            System.out.println(user);
        }
        
    }
}

