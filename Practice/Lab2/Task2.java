public class Task2 {
    public static void main(String[] args) {
        for(int a=2;a<21;a=a+2){
            System.out.print(a+",");

        }
        for(int b=20;b>1;b=b-2){
            System.out.print(b);
            if (b>2){
                System.out.print(",");
            }
        }
    }
}
