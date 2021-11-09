package com.bz.findmax;
import org.junit.Assert;
import org.junit.Test;
public class TestFindMax {
    @Test
    public void findMaxFromGivenThreeFloat(){
        FindMax findMax = new FindMax();
        Float max = findMax.findMaximun(85.5f,80.5f,21.5f);
        Assert.assertEquals((85.5f),max,0.1);
    }
    @Test
    public void findMaxFromGivenThreeFloatWhereMaxIsAtPositionTwo(){
        FindMax findMax = new FindMax();
        Float max = findMax.findMaximun(3.8f,21.9f,8.6f);
        Assert.assertEquals((21.9f),max,0.1);
    }
    @Test
    public void findMaxFromGivenThreeFloatWhereMaxIsAtPositionThree(){
        FindMax findMax = new FindMax();
        Float max = findMax.findMaximun(9.8f,11.9f,29.6f);
        Assert.assertEquals(29.6,max,0.01);
    }

}
