public class task2 {

    
    public static void main (String[]args){
        for(int count=2;count<21;count=count+2){
            System.out.print(count);
            if (count<=20){
                System.out.print(",");
            }

        }
        for (int count2=18;count2>1;count2=count2-2){
            System.out.print(count2);
            if (count2>2){
                System.out.print(",");
            }
        }
    }
}