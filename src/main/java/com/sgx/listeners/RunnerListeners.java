package com.sgx.listeners;

import org.testng.annotations.*;

public class RunnerListeners {

    @BeforeSuite
    public void setUpSuite(){System.out.println("Before Suite In Runner");}

    @AfterSuite
    public void tearDownSuite(){System.out.println("After Suite In Runner");}

    @BeforeMethod
    public void setUp(){System.out.println("Before Method In Runner");}

    @AfterMethod
    public void tearDown(){System.out.println("After Method In Runner");}

    @Test
    public void test1(){
        System.out.println("TEST1");
    }

    @Test
    public void test2(){
        System.out.println("TEST2");
    }
    @Test
    public void test3(){
        System.out.println("TEST3");
    }

}
