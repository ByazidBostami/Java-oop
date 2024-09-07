import java.util.*;
public class task8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int inp=input.nextInt();
        int year=inp/1000000;
        int months=inp/100000;
        int seassion=months%10;
        String check="";
        if (seassion==1){
            check="Spring";
            
        }
        else if(seassion==2){
            check="Summer";
        }
        else if(seassion==3){
            check="Fall";
        }
        System.out.println("Student joined BRAC in "+check+" "+year);
        
        
    }
   
    
}
