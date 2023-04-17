package HWProjectTask;

public class Task2 {
    public static void main(String[] args) {
        /* Create an array of integer values.
        After the array is created, calculate the sum of all stored elements in that array.
         */
        int[]arr={2,5,8,4,22,48,9};
        int sum=0;
        for(int i=0; i< arr.length; i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
