package com.bz.findmax;
import java.lang.*;
public class FindMax {

    public String findMaximum(String x , String y , String z){
        String max = x;
        if(y.compareTo(max)>0){
            max=y;
        }
        if(z.compareTo(max)>0){
            max=z;
        }
        return max;
    }

}
