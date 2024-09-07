public class task1_b {

    public static void main (String[]args){
        int count=1;
        int count_2=2;
        while(count<121){
            System.out.print(count);
            count=count+count_2;
            count_2=count_2+1;
            if (count<121){
                System.out.print(",");
            }
            

        }
    }
}
