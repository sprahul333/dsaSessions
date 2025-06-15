package june14th2025;

import java.util.Arrays;

public class RotateTheArray_ReversalAlgorithm {

    public static void main(String[] args) {

        //4,5,1,3,6 --> Rotate this array by 1 position towards the right
        //6,4,5,1,3

        //4,5,1,3,6 --> Rotate this array by 1 position towards the left
        //5,1,3,6,4

        //Edge Cases: In which scenarios do we need to ensure that the code does not fail

        int a3[]={4,5,1,3,6};
        int noOfRotations=2;

        //Reversal Algorithm:
        //1. Reverse the whole array
        //2. Reverse the values present in first noOfRotations
        //3. Reverse the values present in remaining length-noOfRotations

//        4,5,1,3,6
//        6,3,1,5,4 --> 1st Step
//        3,6,1,5,4 --> 2nd Step
//        3,6,4,5,1 --> 3rd Step (5-2=3)

        if((a3.length == 1 || a3.length ==0) && a3.length%noOfRotations==0 && noOfRotations==0)
            return; //It will skip the execution of the method


        //O(n)
        reverse(a3,0,a3.length-1); //Reverse the whole array

        //noOfRotations=2
        //Reverse the array that is present from 0 to 1
        //O(n)
        reverse(a3,0,noOfRotations-1);

        //noOfRotations=2
        //Size of the array =4
        //Reverse the array that is present from 2 to 4
        //O(n)
        reverse(a3,noOfRotations,a3.length-1);

        //O(n) + O(n) + O(n) => O(3n) => O(n)

        //While calculating the time complexities we consider all the constant values as negligible

        //Since we are rotating the data inside the same array --> In place rotation
        //Hence the space complexity is O(1)

        System.out.println(Arrays.toString(a3));
    }

    //This is a generic logic used to reverse an array based on the given index position
    private static void reverse(int[] arr, int start, int end)
    {
        //Start =0
        //end = 4

        //{4,5,1,3,6}

        //O(n)
        while(start<end) //0<4
        {
            int temp=arr[start]; //arr[0]=4 => temp =4
            arr[start++]=arr[end]; //arr[0]=arr[4]= arr[0]=>6
            arr[end--]=temp; //arr[4]=4
        }
    }
}
