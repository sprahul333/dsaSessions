package june14th2025;

import java.util.Arrays;

public class RotateTheArray {

    public static void main(String[] args) {

        //4,5,1,3,6 --> Rotate this array by 1 position towards the right
        //6,4,5,1,3

        //4,5,1,3,6 --> Rotate this array by 1 position towards the left
        //5,1,3,6,4

        //Edge Cases: In which scenarios do we need to ensure that the code does not fail

        int a3[]={4,5,1,3,6};
        int noOfRotations=2;

        if((a3.length == 1 || a3.length ==0) && a3.length%noOfRotations==0 && noOfRotations==0)
            return; //It will skip the execution of the method

        //O(n) * O(n) => o(n^2) ==> Time Complexity

        //Rotating the array by 1 position to the right
        for(int j=0;j<noOfRotations;j++) //O(n)
        {
            //Whatever value that is present at the end, we are storing it in a temp variable
            int firstElement = a3[a3.length - 1];

            //a3.length-1 = 4
            for (int i = a3.length - 1; i > 0; i--) //O(n)
            {
                //a[4]=a[3] //Whatever value that is present in 3rd index position, store it in the 4th index postiion
                a3[i] = a3[i - 1];
            }

            a3[0] = firstElement;
        }

        System.out.println(Arrays.toString(a3));
    }
}
