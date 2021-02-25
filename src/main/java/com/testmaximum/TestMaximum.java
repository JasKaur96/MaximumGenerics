package com.testmaximum;

public class TestMaximum <T>{
    T x,y,z;

    public static <T extends Comparable<T>> void maximum(T[] element)
    {
        T max = element[0];
        for(T i : element) {
            if(i.compareTo(max) > 0)
                max=i;
        }
        System.out.println("the maximum value in array is "+max);
    }

    public static void main(String[] args) {
        Integer[] a= {1,4,5};
        maximum(a);
    }
}
