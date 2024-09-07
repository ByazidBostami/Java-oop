public class Task2WithoutVariable {
    public static void main(String[] args) {
        int a=24;
        int b=23;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("A="+a);
        System.out.println("A="+b);

    }
    
}
