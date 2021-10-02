package com.bz.findmax;
import org.junit.Assert;
import org.junit.Test;
public class TestFindMax {
    @Test
    public void findMaxFromGivenThreeIntegers(){
        FindMax<Integer> findMax = new <Integer>FindMax(9,10,11);
        int max = findMax.testMaximum(10,11,12);
        Assert.assertEquals(12,max);
    }
    @Test
    public void findMaxFromGivenThreeFloatWhereMaxIsAtPositionTwo(){
        FindMax<Float> findMax = new<Float> FindMax(9.5f,11.6f,8.8f);
        Float max = findMax.testMaximum(9.5f,11.6f,8.8f);
        Assert.assertEquals(11.6f,max,0.1);
    }
    @Test
    public void findMaxFromGivenThreeStringWhereMaxIsAtPositionThree(){
        FindMax<String> findMax = new <String>FindMax("apple","peaches","bananaaa");
        String  max = findMax.testMaximum("abcde","abcd","ab");
        Assert.assertEquals("abcde",max);
    }
    @Test
    public void findMaxFromGivenThreeGenericsFloatWhereMaxIsAtPositionTwo(){
        FindMax<Float> findMax = new<Float> FindMax(12.8f,11.6f,8.8f);
        Float max = findMax.testMaximum();
        Assert.assertEquals(12.8f,max,0.1);
    }

}
