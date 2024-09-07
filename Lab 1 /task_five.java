import java.util.Scanner;
public class task_five {
    public static void main(String[] args){
        System.out.println("Please input a number :");
    
        Scanner inpu= new Scanner(System.in);

        int inp=inpu.nextInt();

        System.out.println("Please input a number :");
    
        Scanner inpu2= new Scanner(System.in);

        int inp2=inpu2.nextInt();
        
        System.out.println("Please input a number :");
    
        Scanner inpu3= new Scanner(System.in);

        int inp3=inpu3.nextInt();

        if (inp>inp2 && inp2>inp3){
            System.out.println("Largest number :"+inp);

        }
        else if (inp2>inp&& inp>inp3){
            System.out.println("Largest number ;"+inp2);

        }
        else if (inp3>inp2 && inp2>inp){
            System.out.println("Largest number :"+inp3);
        }

    
    }


    
}