import java.util.Scanner;
public class Task9 {

    public static void main (String[] args){
        System.out.println("Please input your cgpa :");
        Scanner input=new Scanner(System.in);
        float cgpa=input.nextFloat();
        System.out.println("Please input your credit :");
        Scanner input2=new Scanner(System.in);
        int cr=input2.nextInt();

        if (3.80<=cgpa && cgpa<=3.89 && cr>=30){
            System.out.println("This student is 25 percent");

        }
        else if (3.90<=cgpa && cgpa<=3.94 && cr>=30){
            System.out.println("This student is 50 percent");

        }
        else if (3.95<=cgpa && cgpa<=3.99 && cr>=30){
            System.out.println("This student is 75 percent");

        }
        else if (cgpa==4){
            System.out.println("This student is 100 percent");

        }
        else{
            System.out.println("This student is not eligible for a waiver");
        }




    }


}