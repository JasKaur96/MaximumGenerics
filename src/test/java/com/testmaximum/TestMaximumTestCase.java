package com.testmaximum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMaximumTestCase {
  TestMaximum maxTest = new TestMaximum();
  //Test case for max element in 1st position.
    @Test
    public void maxIntElement_atFirstPosition(){
        int result = maxTest.maxInteger();
        Assertions.assertEquals(1,result);
    }
  //Test case for max element in 2nd position.
    @Test
    public void maxIntElement_atSecondPosition(){
        int result = maxTest.maxInteger();
        Assertions.assertEquals(2,result);
    }
  //Test case for max element in 3rd position.
    @Test
    public void maxIntElement_atThirdPosition(){
        int result = maxTest.maxInteger();
        Assertions.assertEquals(3,result);
    }
}
