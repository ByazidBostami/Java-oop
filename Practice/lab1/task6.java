import java.util.*;
public class task6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int inp=input.nextInt();
        if (inp%4!=0){
            System.out.println(inp+" is not a leap year");

        }
        else if(inp%400!=0 && inp%100==0){
            System.out.println(inp+" is not a leap year");


        }
        else{
            System.out.println(inp+" is a leap year");
        }
    }
    
}
