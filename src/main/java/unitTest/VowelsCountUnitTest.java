package unitTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VowelsCountUnitTest {
    
    @Test
    public void countVowelCharacterInLowerCase(){
        int count =  programPractice.VowelsCount.vowelsCount("my name is ramkumar");
        Assert.assertEquals(count, 6);
    }

    @Test
    public void countVowelCharacterInUpperCase(){
        int count =  programPractice.VowelsCount.vowelsCount("MY NAME IS RAMKUMAR");
        Assert.assertEquals(count, 6);
    }

    @Test
    public void countVowelCharacterInSpecialCharacter(){
        int count =  programPractice.VowelsCount.vowelsCount("#!#@#@$");
        Assert.assertEquals(count, 0);
    }
    
    @Test
    public void countVowelCharacterInNumber(){
        int count =  programPractice.VowelsCount.vowelsCount("12345");
        Assert.assertEquals(count, 0);
    }

    @Test
    public void countVowelCharacterInNull(){
        int count =  programPractice.VowelsCount.vowelsCount(null);
        Assert.assertEquals(count, 0);
    }

    @Test
    public void countVowelCharacterInEmpty(){
        int count =  programPractice.VowelsCount.vowelsCount("");
        Assert.assertEquals(count, 0);
    }

}
