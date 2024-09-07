import java.util.Scanner;
public class taskEleven {

    public static void main (String[]args){
        System.out.println("Please Input a value :");
        Scanner inpu=new Scanner(System.in);
        int input=inpu.nextInt();
        if (input<0){
            System.out.println(2*input);
        }
        else if (input<=0 && input<2){
            System.out.println(input+1);
        }
        else if (input>=2 && input<5){
            System.out.println((input*input)-1);
        }
        else if (input>=5){
            System.out.println(3*(input*input)+2);
        }
    }
}