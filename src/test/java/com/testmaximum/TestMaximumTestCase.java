package com.testmaximum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMaximumTestCase {
    TestMaximum maxTest = new TestMaximum();

    @Test
    public void maxIntElement_atFirstPosition(){
        int result = maxTest.maxInteger();
        Assertions.assertEquals(1,result);
    }

    @Test
    public void maxIntElement_atSecondPosition(){
        int result = maxTest.maxInteger();
        Assertions.assertEquals(2,result);
    }

    @Test
    public void maxIntElement_atThirdPosition(){
        int result = maxTest.maxInteger();
        Assertions.assertEquals(3,result);
    }

    @Test
    public void maxFloatElement_atFirstPosition(){
        int result = maxTest.maxFloat();
        Assertions.assertEquals(1,result);
    }

    @Test
    public void maxFloatElement_atSecondPosition(){
        int result = maxTest.maxFloat();
        Assertions.assertEquals(2,result);
    }

    @Test
    public void maxFloatElement_atThirdPosition(){
        int result = maxTest.maxFloat();
        Assertions.assertEquals(3,result);
    }

    @Test
    public void maxStringElement_atFirstPosition(){
        int result = maxTest.maxString();
        Assertions.assertEquals(1,result);
    }

    @Test
    public void maxStringElement_atSecondPosition(){
        int result = maxTest.maxString();
        Assertions.assertEquals(2,result);
    }

    @Test
    public void maxStringElement_atThirdPosition(){
        int result = maxTest.maxString();
        Assertions.assertEquals(3,result);
    }
}