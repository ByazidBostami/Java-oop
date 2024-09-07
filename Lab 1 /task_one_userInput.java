import java.util.Scanner;
public class task_one_userInput {

    public static void main(String[] args){
        System.out.println("Please enter a Number :");
        Scanner inp=new Scanner(System.in);
        int user=inp.nextInt();
        System.out.println("Please input another number :");
        Scanner inp_two=new Scanner(System.in);
        int user_two=inp_two.nextInt();
        System.out.println(user);
        System.out.println(user+user_two);
        System.out.println(user*user_two);
        System.out.println(user/user_two);


    }
}