package HWProjectTask;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        /* Write a java program to check whether a given number is prime or not? */

        int number=18;
        int counter =0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                counter++;
            }
        }
        if (counter == 2) {
            System.out.println("prime number");
        } else {
            System.out.println("not a prime number");

        }
    }
}
