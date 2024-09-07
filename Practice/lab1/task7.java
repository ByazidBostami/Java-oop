import java.util.*;
public class task7 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int inp=input.nextInt();
        if(inp%5==0 && inp%7==0){
            System.out.println("Divisible by Bosth");

        }
        else if (inp%5==0 && inp%7!=0){
            System.out.println("Invalid:Divisible by 5 Only ");
        }
        else if(inp%5!=0 && inp%7==0){
            System.out.println("Invalid:Divisible by 7 only");
        }
        else{
            System.out.println("No");
        }
    }
    
}
