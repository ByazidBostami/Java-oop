import java.util.Scanner;
public class Task5 {
   public static void main(String[]args){

       int sum=0;
       double avarage=0;
       int maximum=0;
       int minimum=0;
       int count=0;
       int count2=0;

       for (int i=1 ;i<count;i++){
           Scanner input=new Scanner(System.in);
           int newInput=input.nextInt();
           sum=sum+newInput;
           count++;

           if (newInput==0){
               count2++;
           }

           if (count2==3){
               break;
           }

           else{
               count2=0;
               if (count==1) {
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






       }
       avarage=1.0*sum/count;

       System.out.println("Sum="+sum);
       System.out.println("Average="+avarage);
       System.out.println("Minimum="+minimum);
       System.out.println("Maximum="+maximum);


    }
}