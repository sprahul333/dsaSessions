package june14th2025;

public class CountingTheNumberOfVowelsAndConsonants {

    public static void main(String[] args) {

        //Letters - a,e,i,o,u falls under vowels and rest of the letters are consonnants

        String s1="All of you are attending the sessions today";

        int noOfVowels=0;
        int noOfConsonants=0;

        s1=s1.toLowerCase();

        //Time Complexity --> how much time does this algorithm take to execute when the size of the input increases
        //O(n) --> Time of the logic increases as the data inside the string increases
        for(int i=0;i<s1.length();i++)
        {
            if(Character.isLetter(s1.charAt(i))) {
                switch (s1.charAt(i)) {
                    case 'a', 'e', 'i', 'o', 'u' -> noOfVowels++;
                    default -> noOfConsonants++;
                }
            }
        }

        System.out.println("No Of Vowels is: "+noOfVowels);
        System.out.println("No Of Consonants is: "+noOfConsonants);
    }
}
