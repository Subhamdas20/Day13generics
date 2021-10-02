package com.bz.findmax;
import java.lang.*;
public class FindMax {

    public int findMaximun(Integer num1 , Integer num2 , Integer num3){
        int max = num1;
        if(num2.compareTo(max)>0){
            max=num2;
        }
        if(num3.compareTo(max)>0){
            max=num3;
        }
        return max;
    }
}
