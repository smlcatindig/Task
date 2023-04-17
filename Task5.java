package HWProjectTask;

public class Task5 {
    public static void main(String[] args) {
        /* Write a program to swap 2 numbers without a temporary variable?

         */
        int i=8;
        int j=5;

        System.out.println("i="+i);
        System.out.println("j="+j);

        i=i+j;
        j=i-j;
        i=i-j;

        System.out.println("i="+i);
        System.out.println("j="+j);
    }
}
