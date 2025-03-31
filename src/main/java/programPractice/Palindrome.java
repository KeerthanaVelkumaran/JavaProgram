package programPractice;

public class Palindrome {

    public void palindrome(String strString){

        ReverseString rev = new ReverseString();
        String reverse = rev.reverseString(strString);

        if(reverse.equalsIgnoreCase(strString)){
            System.out.println("The string is Palindrome");
        }else{
            System.out.println("The string is NOT  Palindrome");
        }

    }
}
