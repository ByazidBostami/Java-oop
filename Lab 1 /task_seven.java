import java.util.Scanner;
public class task_seven {

    public static void main (String[] args){
        Scanner inpu =new Scanner(System.in);
        int input=inpu.nextInt();

        if(input%7==0 && input%5==0){
            System.out.println("Divisible by Both");
        }
        else if (input%5==0){
            System.out.println("Invalid:Divisible by 5 Only");

        }
        else if(input%7==0){
            System.out.println("Invalid:Divisible by 7 Only");
        }
        else if(input%7==0 && input%5==0){
            System.out.println("Divisible by Both");
        }
        else{
            System.out.println("No");
        }
    

    }
}