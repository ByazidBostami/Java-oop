import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int Inp1=input.nextInt();
        Scanner input1=new Scanner(System.in);
        int Inp2=input1.nextInt();
        Scanner input2=new Scanner(System.in);
        int Inp3=input2.nextInt();
        int largetNum=Inp1;
        if(Inp1>Inp2 && Inp2>Inp3 ){
            largetNum=Inp1;
        }

        else if(Inp2>Inp1 && Inp1>Inp3 ){
            largetNum=Inp2;


        }
        else if(Inp3>Inp2 && Inp2 >Inp1){
            largetNum=Inp3;

        }
        
        
        System.out.println("Largest Number: "+largetNum);
        
    }
    
    
}
