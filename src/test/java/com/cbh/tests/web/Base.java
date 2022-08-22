package com.cbh.tests.web;

import com.cbh.driver.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {


    @BeforeMethod
    public void setUp(){
        Driver.initDriverForWeb();
    }

    @AfterMethod
    public void tearDown(){
        Driver.quitDriver();
    }
}
