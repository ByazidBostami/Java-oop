public class Task1b {
    public static void main(String[] args) {
        
        int count=1;
        int count2=1;
        while(count<121){
            System.out.print(count);
            
            count2++;
            count=count2+count;
            if (count<=120){
                System.out.print(",");
            }
        }
    }
    
}
