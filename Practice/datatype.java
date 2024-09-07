public class datatype{
    public static void main(String[] args) {
        byte b1 = 51;
        short s1 = 513;
        int i1 = 5456;
        long l1= 12345788;
        float f1= 5.0f;
        double d1= 123.4558428743d;
        char c1 = 'A';
        String s2 = "Hello";
        int [] a= {10, 20, 100};
        //type casting 
        int num =200;
        double data=num;//Widening data casting
        double num1 = 10.99;
        int data1 = (int)num1;//Naeeowing data casting 
        //integer to string
        String x=String.valueOf(15);
        String y= Integer.toString(20);
        System.out.println(x+y);
        int n=Integer.parseInt("25");
        int m=Integer.valueOf("60");
        System.out.println(m+n);
        //int to char
        int u=65;
        char c=(char)u;//The ASCII character of the given value is stored as
        
        System.out.println(c); //A



    }
}