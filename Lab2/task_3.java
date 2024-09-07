import java.util.Scanner;
public class task_3 {

    public static void main(String[]args){
        int sum=0;
        int minimum=0;
        int maximum=0;
        double average=0;
        int count =0;
        while(count<10){
            Scanner input=new Scanner(System.in);
            int newInput=input.nextInt();
            count++;
            sum=sum+newInput;
            average=1.0*sum/count;
            if (count==1){
                minimum=newInput;
                maximum=newInput;
            }
            else if (newInput<minimum){
                minimum=newInput;
            }
            else if (newInput>maximum){
                maximum=newInput;
            }

        }
        System.out.println("Sum ="+sum);
        System.out.println("Minimum ="+minimum);
        System.out.println("Maximum ="+maximum);
        System.out.println("Average ="+average);

    }
}