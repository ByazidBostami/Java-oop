public class task_two_without_variables {

    public static void main(String[] args){
        int a=25;
        int b=15;
        a =a^b;
        b =a^b;
        a =a^b;
        System.out.println("A="+a);
        System.out.println("B="+b);
    }
}