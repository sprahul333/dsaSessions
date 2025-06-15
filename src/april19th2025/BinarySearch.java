package april19th2025;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        int arr[]={4,1,5,21,52,3};
        int target=100;
        System.out.println(performBinarySearch(arr,target));
    }

    public static int performBinarySearch(int arr[], int target)
    {
        Arrays.sort(arr);
        int left=0,right=arr.length-1;
        int mid=0;

        while (left<=right)
        {
            mid=(left+right)/2;

            if(arr[mid]==target)
            {
                System.out.println("Element found at index "+mid);
                return mid;
            }

            else if(arr[mid]>target)
                right=mid-1;

            else
                left=mid+1;
        }

        return -(left+1);
    }
}
