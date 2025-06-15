package may17th2025;

import java.util.Arrays;

public class BubbleSortQuestions {

    //Sort the data only for odd numbers
    public static void main(String[] args) {

        int a1[]={20,3,12,123,21,5};

        for(int i=0;i<a1.length;i++)
        {
            for(int j=0;j<a1.length-i-1;j++)
            {
                if(a1[j] % 2==0 || a1[j+1] % 2==0)
                {
                    continue; //Skip the current iteration
                }

                if(a1[j]>a1[j+1])
                {
                    int temp=a1[j];
                    a1[j]=a1[j+1];
                    a1[j+1]=temp;
                }

            }
        }

        System.out.println(Arrays.toString(a1));
    }
}
