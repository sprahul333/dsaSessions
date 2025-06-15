package may31st2025;

import java.util.Arrays;

public class SelectionSort_Descending {

    //{10,9,30,6,1,3}
    public static void sort(int[] arr) {

        //Scans through the complete array and finds the minimum element
        for (int i = 0; i < arr.length; i++) //Running the loop for the array
        {
            int min_idx = i; //Min value is present at 0th index position
            for (int j = i + 1; j < arr.length; j++)
            {
//                j= 5
                //arr[4] = 1 --> Min Value
                //arr[5] = 3

                //3<1 --> Condition not Satisfied
                if (arr[j] > arr[min_idx])
                {
                    min_idx = j; //min_idx=4
                }
            }

            //Once the minimum element is found, swap it with the element at the current index
            if (min_idx != i) {
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {

        int arr[]={10,9,30,6,1,3};

        sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
