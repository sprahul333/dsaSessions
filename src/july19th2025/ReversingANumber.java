package july19th2025;

public class ReversingANumber {

    public static void main(String[] args) {

        double a=453.924;

        //Reverse this number:

        //1st Approach:
        String s3=String.valueOf(a); //Converting the integer to a string

        String rev="";
        for(int i=s3.length()-1;i>=0;i--)
        {
            rev=rev+s3.charAt(i);
        }

//        System.out.println(rev);

        a=Double.parseDouble(rev);

        System.out.println("Reversed Integer is: "+a);

        //2nd Approach: Without converting to string

        double b=982.98; //289
        double rem=0;
        double revNumber=0;

        //Checking till the value of a is greater than 0
        while(b>0)  //0>0 --> Not satisfied then out of the loop
        {
            rem=b%10; //9%10 = 9
            revNumber=revNumber*10+rem; //(28*10)+9 = 289
            b=b/10; //9/10 = 0
        }

        System.out.println(revNumber);
    }
}
