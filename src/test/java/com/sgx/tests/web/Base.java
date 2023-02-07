package com.sgx.tests.web;

import com.sgx.driver.Driver;
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
