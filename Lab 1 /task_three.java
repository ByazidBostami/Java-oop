import java.util.Scanner;
public class task_three {

    public static void main(String[]args){
        Scanner user=new Scanner(System.in);
        String input= user.nextLine();
        if (input.length()<2){
            System.out.println("Invalid student ID");
            return;
        }
        char last_digit=input.charAt(input.length() -2 );
        char second_last_digit=input.charAt(input.length() -1 );
        
        System.out.println(second_last_digit);
        System.out.println(last_digit);

        
    }
}