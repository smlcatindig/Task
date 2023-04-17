package HWProjectTask;

public class Task7 {
    public static void main(String[] args) {
        /* Write a Java Program to print the first 10 numbers of Fibonacci series. */

        int a=0;
        int b=1;
        int count=10;
        System.out.print("Fibonacci series: " +a+ " " +b);

        for(int i=2; i<count; i++){
            int c=a+b;
            System.out.print(" " +c);
            a=b;
            b=c;
        }
    }
}
