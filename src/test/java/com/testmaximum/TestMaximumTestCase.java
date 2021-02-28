package com.testmaximum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMaximumTestCase {

    public static Integer[] a = {1,4,5,2,9};
    public static Float[] b = {1.5f, 8.4f, 2.5f,5.5f};
    public static String[] c = {"Sara","Dinithi","Aman","Aarya"};

    @Test
    public void maxElement_Integer(){
        TestMaximum<Integer> maxTest = new TestMaximum<Integer>(a);
        Integer result = maxTest.maxElement();
        Integer expectedResult = 9;
        Assertions.assertEquals(expectedResult,result);
    }

    @Test
    public void maxElement_Float(){
        TestMaximum<Float> maxTest = new TestMaximum<Float>(b);
        Float result = maxTest.maxElement();
        Float expectedResult = 8.4f;
        Assertions.assertEquals(expectedResult,result);
    }

    @Test
    public void maxElement_String(){
        TestMaximum<String> maxTest = new TestMaximum<String>("Apple","Peach","Banana","Apricot");
        String result = maxTest.maxElement(c);
        String expectedResult = "Sara";
        Assertions.assertEquals(expectedResult,result);
    }
}