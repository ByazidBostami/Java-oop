public class task_1_b {

    public static void main (String[]args){
        int count=1;
        int count2=2;
        while (count<121){
            System.out.print(count);
            count=count+count2;
            if (count<=120){
                System.out.print(",");
            }
            count2++;
            
        }

    }
}