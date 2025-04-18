package unitTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import programPractice.VowelsCount;

public class VowelsCountUnitTest {

    VowelsCount objVowelsCount = new VowelsCount();
    
    @Test
    public void countVowelCharacterInLowerCase(){
        int count = objVowelsCount.vowelsCount("my name is ramkumar");
        Assert.assertEquals(count, 6);
    }

    @Test
    public void countVowelCharacterInUpperCase(){
        int count =  objVowelsCount.vowelsCount("MY NAME IS RAMKUMAR");
        Assert.assertEquals(count, 6);
    }

    @Test
    public void countVowelCharacterInSpecialCharacter(){
        int count =  objVowelsCount.vowelsCount("#!#@#@$");
        Assert.assertEquals(count, 0);
    }
    
    @Test
    public void countVowelCharacterInNumber(){
        int count =  objVowelsCount.vowelsCount("12345");
        Assert.assertEquals(count, 0);
    }

    @Test
    public void countVowelCharacterInNull(){
        int count =  objVowelsCount.vowelsCount(null);
        Assert.assertEquals(count, 0);
    }

    @Test
    public void countVowelCharacterInEmpty(){
        int count =  objVowelsCount.vowelsCount("");
        Assert.assertEquals(count, 0);
    }

}