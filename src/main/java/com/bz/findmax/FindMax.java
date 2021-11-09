package com.bz.findmax;
import java.lang.*;
public class FindMax <T extends Comparable<T>> {
    /**
     * FindMax is a constructor
     * @param x , y ,z are three input from user
     * */
    T x , y , z ;
    public FindMax(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public T testMaximum(){
      return   FindMax.testMaximum(x , y , z);
    }

    /**
     * testMaximum is used to check maximum of 3 inputs
     * @param x is user input
     * @param y is user input
     * @param z is user input
     * */

    public static  <T extends Comparable<T>> T testMaximum(T x , T y , T z){
        T max =  x;
        if(y.compareTo(max)>0){
            max=y;
        }
        if(z.compareTo(max)>0){
            max=z;
        }
        printMax(max);
        return max;
    }
    public static <T>void printMax(T ... a){
        for(T i:a) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

}

