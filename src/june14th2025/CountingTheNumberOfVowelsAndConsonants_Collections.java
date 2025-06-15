package june14th2025;

import java.util.Set;

public class CountingTheNumberOfVowelsAndConsonants_Collections {

    public static void main(String[] args) {

        //Letters - a,e,i,o,u falls under vowels and rest of the letters are consonnants

        String s1="All of you are attending the sessions today";

        int noOfVowels=0;
        int noOfConsonants=0;

        s1=s1.toLowerCase();

        //Unmodifiable set --> no one cannot change the values of the set
        Set<String> vowels=Set.of("a","e","i","o","u");

        //Best Case: O(n)
        //Worst Case: O(n)
        //Optimal Case: O(n)

        //Time Complexity --> how much time does this algorithm take to execute when the size of the input increases
        //O(n) --> Time of the logic increases as the data inside the string increases
        for(int i=0;i<s1.length();i++)
        {
            if(Character.isLetter(s1.charAt(i))) {

                if(vowels.contains(s1.charAt(i))) {
                    noOfVowels++;
                }

                else
                    noOfConsonants++;
            }
        }

        System.out.println("No Of Vowels is: "+noOfVowels);
        System.out.println("No Of Consonants is: "+noOfConsonants);
    }
}
