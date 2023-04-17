package HWProjectTask;

public class Task9 {
    public static void main(String[] args) {
        /* Write a java program to find the second largest number in the array? */

        int[]arr={93,78,4,32,22,567,4,90};

        int a=0; // largest number
        int b=0; // second largest number

        for(int i=0; i<arr.length; i++){
            if(arr[i]>a){
                b=a;
                a=arr[i];
            }
        }
        System.out.println("The second largest number is: " + b);
    }
}
