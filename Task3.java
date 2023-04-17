package HWProjectTask;

public class Task3 {
    public static void main(String[] args) {
        /* Create a 2D array or integer type where you will store odd and even numbers.
        Develop a program which will identify/print the even numbers only.
         */
        int[][]arr={
            {22,68,4,98,3,7},
            {75,64,9,1,5}
        };
        for(int i=0; i< arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                int element=arr[i][j];
                if(element %2==0){
                    System.out.println(element);
                }

            }
        }
    }
}
