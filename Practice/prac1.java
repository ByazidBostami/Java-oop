class prac1 {
    public static void main(String[] args) {
    int a= 15; //Value of a is 5
    int b= 4; //Value of b is 7
    System.out.println(a+b);
    float a1= a;
    float b1= b;
    String a2= Integer.toString(a);
    String b2= Integer.toString(b);
    System.out.println(a1+b1);
    System.out.println(a1 == a);
    System.out.println(a2+b2);
    System.out.println(a2+"Hi"+b2);
    System.out.println("Hi"+Integer.toString(b+1));
    }
    }