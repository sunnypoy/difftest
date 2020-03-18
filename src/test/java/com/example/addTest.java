package com.example;
import org.junit.Assert;

import static org.junit.Assert.*;

public class addTest {
    @org.junit.Test
    public void addtion() {
        add y = new add();
        int result = y.addtion(1, 1);
        Assert.assertEquals("multiply test error", 2, result);
    }
}

