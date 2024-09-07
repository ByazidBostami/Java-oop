import java.util.Scanner;
public class task_eight {

    public static void main(String[] args){
        Scanner inpu=new Scanner(System.in);
        int input=inpu.nextInt();
        int year=input/1000000;
        int session=input/100000;

        //System.out.println(session);
        int check=session%100;
        //System.out.println(check);
        if (check==1){
            System.out.println("Student Joined BRAC in Spring "+year);
        }
        else if (check==2){
            System.out.println("Student Joined BRAC in Fall "+year);
        }
        else if (check==3){
            System.out.println("Student Joined BRAC in Summer "+year);
        }

    }
}