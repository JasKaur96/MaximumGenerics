package com.testmaximum;

public class TestMaximum<T extends Comparable<T>>{

    T[] elements;

    public TestMaximum(T ...elements) {
        this.elements = elements;
    }

    //Finds max Integer and returns its position.
    public static <T extends Comparable<T>> T maxElement(T[] element){
        T max = element[0];
        for(T i : element) {
            if(i.compareTo(max) > 0)
                max=i;
        }
        System.out.println("Maximum value in array is : "+max);
        return max;
    }


    public T maxElement(){
        return TestMaximum.maxElement(elements);
    }
}
