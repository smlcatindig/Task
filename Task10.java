package HWProjectTask;

public class Task10 {
    public static void main(String[] args) {
        /* Write a program to print out duplicate elements from
        an Array of Strings? */

        String[] arr = {"green", "blue", "white", "green", "orange", "black"};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);


                }
            }
        }
    }
}
