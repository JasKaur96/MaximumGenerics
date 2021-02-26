package com.testmaximum;

import java.util.Arrays;

public class TestMaximum{
    public static Integer[] a= {1,4,5};
    //Finds max Integer and returns its position.
    public static int maxInteger()
    {
        int max = a[0];
        for(int i : a) {
            if(i > max)
                max = i;
        }
        int index = (Arrays.asList(a).indexOf(max)) + 1;
        System.out.println("\nMaximum value in array is : "+max + " Position : "+index);
        return index;
    }

    // prints the array.
    public static void printIntArray()
    {
        for(int i : a)
           System.out.println(i+ " ");
    }

    public static void main(String[] args) {
        printIntArray();
        maxInteger();
    }
}
