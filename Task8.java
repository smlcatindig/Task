package HWProjectTask;

public class Task8 {
    public static void main(String[] args) {
        /* Maximum and minimum number in the array? */

        int[] numbers = {22, 67, 55, 4, 986, 2, 75};
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];


            } else if (numbers[i] < min) {
                min = (numbers[i]);

            }
        }
        System.out.println("Maximum number:" + max);
        System.out.println("Minimum number:" + min);
    }
}
