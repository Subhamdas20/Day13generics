package com.bz.findmax;
import java.lang.*;
public class FindMax {

    public Float findMaximun(Float num1 , Float num2 , Float num3){
        Float max = num1;
        if(num2.compareTo(max)>0){
            max=num2;
        }
        if(num3.compareTo(max)>0){
            max=num3;
        }
        return max;
    }
}
