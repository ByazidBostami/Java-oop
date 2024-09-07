import java.util.*;
public class Task3{
    public static void main(String[] args) {
        int sum=0;
        int max=0;
        int mini=0;
        double avg=0;
        

        for (int i=0;i<10;i++){
            Scanner input=new Scanner(System.in);
            int inp=input.nextInt();
            sum=sum+inp;
            avg=1.0*sum/10;
            if (i==1){
                max=inp;
                mini=inp;

            }
            else if(max>inp){
                max=inp;
            }
            else if (mini<inp){
                mini=inp;
            }

        }
        System.out.println("Sum="+sum);
        System.out.println("Minimum="+mini);
        System.out.println("Maximum="+max);
        System.out.println("Average="+avg);
    }
}