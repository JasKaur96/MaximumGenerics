package com.testmaximum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMaximumTestCase {
    TestMaximum maxTest = new TestMaximum();

    @Test
    public void maxElement_atFirstPosition(){
        int result = maxTest.maxInteger();
        Assertions.assertEquals(1,result);
    }

    @Test
    public void maxElement_atSecondPosition(){
        int result = maxTest.maxInteger();
        Assertions.assertEquals(2,result);
    }

    @Test
    public void maxElement_atThirdPosition(){
        int result = maxTest.maxInteger();
        Assertions.assertEquals(3,result);
    }
}