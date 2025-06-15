package may17th2025;

import java.util.Arrays;

public class BubbleSortAlgo {

    //Question: Sort only the odd numbers in the array, do not sort any even numbers

    //Time complexity --> How much time does the logic take to execute irrespective of any size of data
    //Space Complexity --> How much memory allocation is required to perform the logic

    //O(1) --> Constant --> Never changes the time taken irrespective of whether there is less or more data
    //O(n) --> Linear Equation --> TIme taken to execute the code will increase as the size of the data increases
    //O(n^2) --> Quadratic Time --> Time taken to execute the code will amplify as the size of the data increases
    public static void main(String[] args) {

        //Bubble sort is one of the popular sorting algorithms

        //One of easiest algorithms to begin with

        int a1[]= {40,21,12,512,12};

        System.out.println(Arrays.toString(a1)+" --> Before sorting");
        //Time Complexity is O(n^2)
        //a1.length --> Determines the size of the array

        //n*n-1
        //n^2-1
        //Here 1 is a negligible values
        //O(n^2)

        //Best case scenario : O(n^2)
        //Worse case scenario : O(n^2)

        for(int i=0;i<a1.length;i++) //Loop runs for n times
        {
            //a1.length - i --> Using it here to reduce the number of swappings
            for(int j=i+1;j<a1.length-i;j++) //Loop runs for n-1 times
            {
                if(a1[i]>a1[j])
                {
                    int temp=a1[i];
                    a1[i]=a1[j];
                    a1[j]=temp;
                }
            }
        }

        System.out.println(Arrays.toString(a1)+" --> After sorting");

    }
}
