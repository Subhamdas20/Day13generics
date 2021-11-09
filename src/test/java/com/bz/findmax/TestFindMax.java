package com.bz.findmax;
import org.junit.Assert;
import org.junit.Test;
public class TestFindMax {
    @Test
    public void findMaxFromGivenThreeString(){
        FindMax findMax = new FindMax();
        String max = findMax.findMaximum("abcdef","abcde","abcd");
        Assert.assertEquals(("abcdef"),max);
    }
    @Test
    public void findMaxFromGivenThreeStringWhereMaxIsAtPositionTwo(){
        FindMax findMax = new FindMax();
        String max = findMax.findMaximum("abcd","abcdef","abc");
        Assert.assertEquals(("abcdef"),max);
    }
    @Test
    public void findMaxFromGivenThreeStringWhereMaxIsAtPositionThree(){
        FindMax findMax = new FindMax();
        String max = findMax.findMaximum("abc","abcde","abcdefg");
        Assert.assertEquals("abcdefg",max);
    }

}
