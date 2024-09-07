import java.util.Scanner;

public class task_six {

    public static void main (String[]args){
        Scanner inpu=new Scanner(System.in);
        int input= inpu.nextInt();
        if (input%4!=0){
            System.out.println(input+"is not a leap year");

        }
        else if (input%400!=0 && input%100==0){
            System.out.println(input+"in not a leap year");
        }
        else{
            System.out.println(input+"is a leap year");
        }

    }
}