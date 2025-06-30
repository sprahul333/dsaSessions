package june28th2025;

import java.util.Arrays;

public class InsertionSort_Descending {

    //Time Complexity:
    //Best Case is O(n) --> If the array is already sorted
    //Worst Case is O(n^2) --> If the array is to be sorted
    //Space Complexity is O(1) --> as we are swapping within the same array
    public static void main(String[] args) {
        int arr[] = {4,10,5,7,-2,-1};

        //arr.length = 6
        for(int i=1;i<arr.length;i++) //Iterate over the complete array
        {
            //for i=2; we are taking key value as arr[2] --> 5
            //j=i-1; in this case we will say 2-1=1
            int temp = arr[i];
            int j = i-1;

            //First we need to check the value of j is greater than or equal to zero (In this case value of j=0)
            //arr[j] --> arr[0] --> 4
            //key=5
            //while(0>=0 && 4>5) --> Since the condition is not satisfied it will not execute the while loop
            while(j>=0 && arr[j] < temp) //Keep on shifting the values to the right until the condition is satisfied
            {
                //arr[1+1]= arr[2] = arr[1] // We are storing the value that is present at 1st index position to the second index position
                arr[j+1] = arr[j];
                j--; //Reducing the value of j by 1
            }

            //arr[0+1] => arr[1] = 5
            arr[j+1] = temp;

            System.out.println(Arrays.toString(arr));
        }

        System.out.println("*********************************************************************");

        for(int num : arr)
        {
            System.out.print(num +" ");
        }
    }
}
