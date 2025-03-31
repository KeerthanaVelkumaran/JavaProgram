package programPractice;

public class ReverseString {

    public String reverseString(String strOriginal){

        String reverseString = "";

        for(int i=strOriginal.length()-1;i>=0;i--){
            reverseString = reverseString + strOriginal.charAt(i);
        }
        return reverseString;
    }
}
