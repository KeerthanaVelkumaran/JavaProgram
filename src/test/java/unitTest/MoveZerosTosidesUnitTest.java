package unitTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import programPractice.MoveZeroToLeftRight;


public class MoveZerosTosidesUnitTest {

    MoveZeroToLeftRight objMoveZeros = new MoveZeroToLeftRight();
    
    @Test
    public void arrayWithZerosNonZeros(){
        int[] arrayInput = {0,1,2,3,0,9};
        int expected[] = {0,0,1,2,3,9};
        int[] outputArray = objMoveZeros.moveZerosToFront(arrayInput);
        Assert.assertEquals(outputArray,expected);
    }

    @Test
    public void arrayWithZerosOnly(){
        int[] arrayInput = {0,0,0,0,0,0};
        int expected[] = {0,0,0,0,0,0};
        int[] outputArray = objMoveZeros.moveZerosToFront(arrayInput);
        Assert.assertEquals(outputArray,expected);
    }
    @Test
    public void arrayWithnonZeros(){
        int[] arrayInput = {1,2,4,6,2,4,9,7};
        int expected[] = {1,2,4,6,2,4,9,7};
        int[] outputArray = objMoveZeros.moveZerosToFront(arrayInput);
        Assert.assertEquals(outputArray,expected);
    }

    @Test
    public void arraysWithoutValues(){
        int[] arrayInput = {};
        int expected[] = {};
        int[] outputArray = objMoveZeros.moveZerosToFront(arrayInput);
        Assert.assertEquals(outputArray,expected);
    }


    @Test
    public void arraysWithZerosinFront(){
        int[] arrayInput = {0,0,9,3,4};
        int expected[] = {0,0,9,3,4};
        int[] outputArray = objMoveZeros.moveZerosToFront(arrayInput);
        Assert.assertEquals(outputArray,expected);
    }

    @Test
    public void arraysWithZerosinEnd(){
        int[] arrayInput = {9,3,4,0,0,0};
        int expected[] = {0,0,0,9,3,4};
        int[] outputArray = objMoveZeros.moveZerosToFront(arrayInput);
        Assert.assertEquals(outputArray,expected);
    }

   
}