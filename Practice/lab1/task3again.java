import java.util.Scanner;
public class task3again {
    public static void main(String[] args) {
        System.out.println("Please enter your studentID =");
        Scanner input=new Scanner(System.in);
        String newinput=input.nextLine();
        if (newinput.length()<2){
            System.out.println("Invalid Student id");
            return;
        }
        char lastDigit=newinput.charAt(newinput.length()-2);
        char secondDgt=newinput.charAt(newinput.length()-1);
        System.out.println(lastDigit);
        System.out.println(secondDgt);
    }
    
}
