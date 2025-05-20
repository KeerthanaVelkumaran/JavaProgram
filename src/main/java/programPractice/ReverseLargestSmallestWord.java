package programPractice;

import java.util.ArrayList;
import java.util.List;

public class ReverseLargestSmallestWord {
    /**
     Reverse the Smallest and largest word in the sentence
     Input: "Java is Programming language"
     Output:  "Java si gnimmargorP langugage"
     */

//------------------------------------------------
    /* Approach-------
     * Approach: split the each word and store in array.
     *  Then traverse through each element and find the length of the word and store it.
     * Have a smallest and largest variable initialized and compare the value with it and update and append the string
     */
    public static void main(String[] args) {
        String inputSentence = "My name is Keerthana and i am a software engineer Working in International business Machines";

        ReverseLargestSmallestWord objRef = new ReverseLargestSmallestWord();
        String output = objRef.smallestLargestWord(inputSentence);
        System.out.print(output + " ");

    }
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public String smallestLargestWord(String inputSentence) {

        if (inputSentence.isEmpty())
            return "Enter Valid string";

        String smallestWord = "", largestWord = "";
        String[] splitArr = inputSentence.split(" ");
        if (splitArr.length<=1)
            return inputSentence;
        StringBuilder outputString = new StringBuilder();
        for (int i=0;i<splitArr.length;i++) {

            if(i==0){
                smallestWord = splitArr[0];
                largestWord = splitArr[0];
            }
            else if(splitArr[i].length() < smallestWord.length()){
                smallestWord = splitArr[i];
            }
            else if(splitArr[i].length() > largestWord.length()){
                largestWord = splitArr[i];
            }

        }

        for(int i=0;i<splitArr.length;i++){
            if(splitArr[i].equals(smallestWord)){
                splitArr[i] =   reverseString(smallestWord);
            }else if(splitArr[i].equals(largestWord)){
                splitArr[i] =   reverseString(largestWord);
            }
            outputString.append(splitArr[i]).append(" ");
        }

        return outputString.toString().trim();
    }


}
