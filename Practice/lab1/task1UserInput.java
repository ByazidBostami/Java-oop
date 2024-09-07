import java.util.Scanner;
public class task1UserInput {
    public static void main(String[]args){
        System.out.println("Please enter first number :");
        Scanner input=new Scanner(System.in);
        int userinput=input.nextInt();
        System.out.println("Please enter second number :");
        Scanner input2=new Scanner(System.in);
        int userinput2=input2.nextInt();
        System.out.println(userinput+userinput2);
        System.out.println(userinput*userinput2);

    }
    
}
