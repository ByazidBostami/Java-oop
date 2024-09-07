import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        System.out.println("Please enter your Student Id=");
        Scanner input=new Scanner(System.in);
        String userInput=input.nextLine();
        int len =userInput.length();
        if(len==8){
            int lastD=Integer.parseInt(userInput)/10000000;
            int lastD2=Integer.parseInt(userInput)/1000000;
            System.out.println(lastD);
            System.out.println(lastD2);

        }
        else{
            System.out.println("Invalid StudentId");
        }
        
    }
    
}
