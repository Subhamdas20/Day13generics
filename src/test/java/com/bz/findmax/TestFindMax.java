package com.bz.findmax;
import org.junit.Assert;
import org.junit.Test;
public class TestFindMax {
    /*
    * test method to run junit tests
    * */
    @Test
    public void givenThreeIntegersWhenComparedShouldReturnLargestInteger(){
        FindMax<Integer> findMax = new <Integer>FindMax(9,10,11);
        int max = findMax.testMaximum(10,11,12);
        Assert.assertEquals(12,max);
    }
    @Test
    public void givenThreeFloatWhenComparedShouldReturnLargestFloatNumberAtPositionTwo(){
        FindMax<Float> findMax = new<Float> FindMax(9.5f,11.6f,8.8f);
        Float max = findMax.testMaximum(9.5f,11.6f,8.8f);
        Assert.assertEquals(11.6f,max,0.1);
    }
    @Test
    public void givenThreeStringsWhenComparedShouldReturnLargestStringAtPositionThree(){
        FindMax<String> findMax = new <String>FindMax("apple","peaches","bananaaa");
        String  max = findMax.testMaximum("abcde","abcd","ab");
        Assert.assertEquals("abcde",max);
    }
    @Test
    public void givenThreeFloatWhenComparedShouldReturnLargestFloatAtPositionTwo(){
        FindMax<Float> findMax = new<Float> FindMax(12.8f,11.6f,8.8f);
        Float max = findMax.testMaximum();
        Assert.assertEquals(12.8f,max,0.1);
    }

}

