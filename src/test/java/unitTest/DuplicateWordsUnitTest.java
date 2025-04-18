package unitTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import programPractice.DuplicateWordInString;
import programPractice.MoveZeroToLeftRight;


public class DuplicateWordsUnitTest {

    DuplicateWordInString objDuplicateWords = new DuplicateWordInString();
    
    @Test
    public void stringWithDuplicateWords(){
        String sentence = "My Name is Ram Ram";
        List<String> expected = Arrays.asList("Ram");
        Assert.assertEquals(objDuplicateWords.printDuplicateWordsInSentence(sentence),expected);
    }

    @Test
    public void stringWithNoDuplicate(){
        String sentence = "My Name is Ram ram";
        List<String> expected = Collections.emptyList();
        Assert.assertEquals(objDuplicateWords.printDuplicateWordsInSentence(sentence),expected);
    }

    @Test
    public void stringWithMoreDuplicateValues(){
        String sentence = "My Name is Ram . Ram is good boy";
        List<String> expected = Arrays.asList("is","Ram");
        Assert.assertEquals(objDuplicateWords.printDuplicateWordsInSentence(sentence),expected);
    }


   
}