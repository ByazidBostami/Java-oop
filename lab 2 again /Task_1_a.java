public class Task_1_a {

    public static void main(String[]args){
        int count=2;
        while(count<51){
            System.out.print(count);
            count=count+4;
            if (count<=50){
                System.out.print(",");
            }
        }
    }
}