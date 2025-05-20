package unitTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import programPractice.DuplicateWordInString;
import programPractice.ReverseLargestSmallestWord;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ReverselargestSmallestUnitTest {

    ReverseLargestSmallestWord objReverseWordss = new ReverseLargestSmallestWord();
    
    @Test
    public void stringWithLessWords(){
        String sentence = "Java is Programming language";
        String expectedOutput = "Java si gnimmargorP language";
        Assert.assertEquals(objReverseWordss.smallestLargestWord(sentence),expectedOutput);
    }

    @Test
    public void stringWithNoWords(){
        String sentence = "";
        String expectedOutput = "Enter Valid string";
        Assert.assertEquals(objReverseWordss.smallestLargestWord(sentence),expectedOutput);
    }

    @Test
    public void stringWithMoreWords(){
        String sentence = "My name is Keerthana and i am a software engineer Working in International business Machines";
        String expectedOutput = "My name is Keerthana and i am a software engineer Working in lanoitanretnI business Machines";
        Assert.assertEquals(objReverseWordss.smallestLargestWord(sentence),expectedOutput);
    }

    @Test
    public void stringWithOnlyOneWord(){
        String sentence = "One";
        String expectedOutput = "One";
        Assert.assertEquals(objReverseWordss.smallestLargestWord(sentence),expectedOutput);
    }


   
}