package com.example;
import org.junit.Assert;

import static org.junit.Assert.*;

public class divisionTest {
    @org.junit.Test
    public void div() {
        division x = new division();
        int result = x.div(1, 1);
        Assert.assertEquals("multiply test error", 1, result);
    }

}
