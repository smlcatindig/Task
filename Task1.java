package HWProjectTask;

public class Task1 {
    public static void main(String[] args) {
        /* Create a program that uses an array to store
        a list of temperatures for a week, and then uses a loop
        to find the highest and lowest temperature for the week.
         */

        int[] temp = {60, 55, 82, 88, 90, 68, 75};

        int high =temp[0];
        int low =temp[0];

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > high) {
                high = temp[i];
            } else if (temp[i] < low) {
                low = temp[i];
            }
        }
        System.out.println("Highest temperature=" + high);
        System.out.println(("Lowest temperature=" + low));

    }
    }