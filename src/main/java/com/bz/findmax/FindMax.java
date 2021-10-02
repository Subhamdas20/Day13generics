package com.bz.findmax;
import java.lang.*;
public class FindMax <T extends Comparable<T>> {
    T x , y , z ;
    public FindMax(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public T testMaximum(){
      return   FindMax.testMaximum(x , y , z);
    }
    public static  <T extends Comparable<T>> T testMaximum(T x , T y , T z){
        T max =  x;
        if(y.compareTo(max)>0){
            max=y;
        }
        if(z.compareTo(max)>0){
            max=z;
        }
        return max;
    }
    public static <T>void printMax(T ... a){

    }
}
