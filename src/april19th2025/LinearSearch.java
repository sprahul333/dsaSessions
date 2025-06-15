package april19th2025;

public class LinearSearch {

    public static void main(String[] args) {

        int a[]={42,2,4,-40,21};
        int keyValue=2;

        linearSearch(a,keyValue);
    }

    //Drawback with linear search is that we have to iterate across the whole array in a worst case scenario
    //Big O --> Represents the notation to determine the time and space complexity

    //Time complexity --> Here we mention how much time does the algorithm take to execute
    //Space Complexity --> Here we mention how much memory is required to execute the algorithm

    //Time Complexity:
    //Best Case Scenario --> O(1) --> If the value is present at the first index position
    //Worst Case Scenario --> O(n) --> Time taken to execute the algorithm increases as the size of the data increases
    public static void linearSearch(int array[], int key) {

        for(int i=0;i<array.length;i++)
        {
            if(array[i]==key)
            {
                System.out.println("Value is found at index: "+i);
                break;
            }
        }
    }
}
