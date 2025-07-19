package july19th2025;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class ReversingAnArray {

    public static void main(String[] args) {

        //Below are the questions that we need to ask from the interviewer:

        //1. Reverse an array lexicographically (Sort based on descending order) --> Which we have already discussed in sorting classes
        //2. Reverse an array based on the insertion order --> Discussing currently

        //First Approach: traditional approach
        int original[]={9,2,7,3,10,67,32}; //Size of the array is 7
        reverseArrayUsingTraditionalApproach(original);

        //Second Approach: Using the two pointer algorithm (In place reversal)
        int[] original2={10,20,40,30,60}; //Size of the array is 7
        reverseArrayUsingTwoPointers(original2);

        //Third Approach: Using Collections.reverse() (In Place Reversal)
        Integer[] original3={500,200,100,400,300}; //Size of the array is 7
        List<Integer> l3=Arrays.asList(original3); //Converts the array to a list object

        Collections.reverse(l3); //This is part of collections library

        System.out.println("Reversed array is (Using Collections.reverse()) : "+Arrays.toString(original3));

        //Fourth Approach: Using Commons-Lang Library
        int original4[]={40,50,-2,30,101};
        ArrayUtils.reverse(original4);
        System.out.println("Reversed array is (Using ArrayUtils.reverse()) : "+Arrays.toString(original4));

        //Fifth Approach : Using Streams

        int original5[]= {32,10,67,89,23};

        //.range() is inclusive of start index position and exclusive of end index position
        Integer[] i10=IntStream.range(0,original5.length)
                .map(index -> original5[original5.length-1-index])
                .boxed()//Converting int to Integer
                .toArray(n -> new Integer[n]);

        System.out.println("Reversed array is (Using Streams) : "+Arrays.toString(i10));
    }

    public static void reverseArrayUsingTwoPointers(int[] original) {

        int start = 0, end = original.length - 1;

        //Time complexity is O(log n)
        //Space complexity if O(1)
        while (start < end) //0<7
        {
            int temp = original[start]; //temp=original[0] = 9 (temp stores the value that is 9)
            original[start] = original[end]; //original[0] = original[6] = 32 (At the first index position of the original, the value is 32)
            original[end] = temp; //original[6] = temp = 9 (At the last index position, the value stored is 9)

            start++;
            end--;
        }

        System.out.println("Reversed Array using 2 Pointers: "+Arrays.toString(original));
    }

    public static void reverseArrayUsingTraditionalApproach(int[] original)
    {
        int rev[]=new int[original.length]; //Creating another array

        //rev[0] = 32
        //rev[1] = 67
        //rev[2] = 10
        //rev[3] = 3
        //rev[4] = 7
        //..............................................................................................

        //Space Complexity is O(n)
        for(int i=0;i<original.length;i++) //O(n) --> Time Complexity
        {
            //rev[0] = arr[7-1-0]
            //rev[0] = arr[6] =32
            //rev[0] = 32

            //When i=1;
            //rev[1] = arr[7-1-1]
            //rev[1] = arr[5] = 67

            //...........................................
            rev[i]=original[original.length-1-i];
        }

        System.out.println("Reversed Array is: "+ Arrays.toString(rev));
    }
}
