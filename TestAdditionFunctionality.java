package com.example.jenkinsmavenlab;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAdditionFunctionality {

    Calculator obj;
    int result;

    @BeforeGroups("RegressionTest")
    public void initGroup() {
        System.out.println("Before Group");
        obj = new Calculator();
    }

    @BeforeClass
    public void init() {
        System.out.println("Before Class");
        obj = new Calculator();
    }

    @BeforeMethod
    public void reinit() {
        System.out.println("Before Method");
        result = 0;
    }

    @Test(priority = 1)
    public void testAdditionWithPositiveNumbers() {
        System.out.println("1st Test Case");

        result = obj.addition(10, 20);

        Assert.assertEquals(result, 30, "positive number");
    }

    @AfterClass
    public void teardown() {
        System.out.println("After Class");
        obj = null;
    }
}
