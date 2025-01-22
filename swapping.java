public class swapping{
    public static void main(String[]args){
        int a=10, b=39;
        System.out.println("Before swapping:"+ a +" "+ b);
        /*logic 1:
        int t=a;
        a=b;
        b=t;*/
        /*logic 2 using + - only;
        a=a+b;
        b=a-b;
        a=a-b;*/
        /*logic 3 when non zero values using * /;
        a=a*b;
        b=a/b;
        a=a/b;*/
        /* logic 4 bitwise XOR;
        a=a^b;
        b=a^b;
        a=a^b;*/
        /*logic 5 Single statement;
        b=a+b -(a=b);*/


        System.out.println("After swapping the two numbers:"+a+ " "+b);
    }
}