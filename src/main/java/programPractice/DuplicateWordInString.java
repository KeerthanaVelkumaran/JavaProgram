package programPractice;

import java.util.ArrayList;
import java.util.List;

public class DuplicateWordInString {
    /**Find the duplicate word in the Sentence 
input - " My name is Ram Ram"
ouput - Ram */

//------------------------------------------------
/* Approach-------
 * First i will split each words in sentence using split method with spaces in the String and put in array of string type
 * Then traverse the each indeices in the array of element with two for loops
 * then check if the word is getting repeated and increase the count and lastly print the words before the loop ends
 */

 public static void main(String[] args) {
    String inputSentence = "My name is ram ram is - yrdy - iiis-- -- -- @#### ** ##@ ##@";

    DuplicateWordInString objRef = new DuplicateWordInString();
    ArrayList<String> output = objRef.printDuplicateWordsInSentence(inputSentence);
    

    for(String outputWord : output){
        System.out.print(outputWord+" ");
    }
    

}
public ArrayList<String> printDuplicateWordsInSentence(String inputSentence){

    String[] sentenceToArray = inputSentence.split(" ");
   
    int lengthOfWords = sentenceToArray.length;
    ArrayList<String> listOfWords = new ArrayList<String>();
     
    for(int i=0;i<lengthOfWords;i++){
        int count= 0;
        for (int j=0; j<lengthOfWords; j++){
            if(sentenceToArray[i].equals(sentenceToArray[j])){
                    if(j<i){
                        break;
                    }
                    count++;
            }
        }
        if(count>1){
            listOfWords.add(sentenceToArray[i]);
        }

    }

    // if(listOfWords.size()==0)
    // return "No duplicate words";
    return listOfWords;

}


}
