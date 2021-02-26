package com.testmaximum;

import java.util.Arrays;

public class TestMaximum{
    public static Integer[] a = {1,4,5};
    public static Float[] b = {1.5f, 8.4f, 2.5f};
    public static String[] c = {"Sara","Dinithi","aman"};

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

    // prints the Integer array.
    public static void printIntArray()
    {
        for(int i : a)
           System.out.println(i+ " ");
    }

    public static int maxFloat()
    {
        float max = b[0];
        for(float i : b) {
            if(i > max)
                max = i;
        }
        int index = (Arrays.asList(b).indexOf(max)) + 1;
        System.out.println("\nMaximum value in array is : "+max + " Position : "+index);
        return index;
    }

    // prints the Float array.
    public static void printFloatArray()
    {
        for(float i : b)
            System.out.println(i+ " ");
    }

    public static int maxString()
    {
        String max = c[0];
        int len = c[0].length();
        for(String i : c) {
            if(i.compareTo(max) > len)
                max = i;
        }
        int index = (Arrays.asList(c).indexOf(max)) + 1;
        System.out.println("\nMaximum value in array is : "+max + " Position : "+index);
        return index;
    }

    // prints the String array.
    public static void printStringArray()
    {
        for(String i : c)
            System.out.println(i+ " ");
    }

    public static void main(String[] args) {
        printIntArray();
        maxInteger();
        printFloatArray();
        maxFloat();
        printStringArray();
        maxString();
    }
}
