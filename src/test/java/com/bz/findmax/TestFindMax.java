package com.bz.findmax;
import org.junit.Assert;
import org.junit.Test;
public class TestFindMax {
    @Test
    public void findMaxFromGivenThreeIntegers(){
        FindMax findMax = new FindMax();
        int max = findMax.findMaximun(9,7,8);
        Assert.assertEquals(9,max);
    }
    @Test
    public void findMaxFromGivenThreeIntegersWhereMaxIsAtPositionTwo(){
        FindMax findMax = new FindMax();
        int max = findMax.findMaximun(9,11,8);
        Assert.assertEquals(11,max);
    }
    @Test
    public void findMaxFromGivenThreeIntegersWhereMaxIsAtPositionThree(){
        FindMax findMax = new FindMax();
        int max = findMax.findMaximun(9,11,25);
        Assert.assertEquals(25,max);
    }
}
