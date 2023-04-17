package HWProjectTask;

public class Task4 {
    public static void main(String[] args) {
        /* Create a 2D array of integers.
        Develop a program which will calculate the sum of even and odd numbers for that array.
         */
        int[][]arr={
                {45,96,3,7,83},
                {88,23,6,32,98,4}
        };
        int odd=0;
        int even=0;
        for(int i=0; i< arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    even = even + arr[i][j];
                } else if (arr[i][j] % 2 != 0) {
                    odd = odd + arr[i][j];
                }
            }
        }
                System.out.println(even);
            System.out.println(odd);
            }
        }