package com.sgx.extentreports;

import com.aventstack.extentreports.ExtentTest;

public class ExtentManager {

    private ExtentManager(){}

    private static ThreadLocal<ExtentTest> threadLocalExtentTest = new ThreadLocal<>();

    static ExtentTest getExtentTest(){
        return threadLocalExtentTest.get();
    }

    static void setExtentTest(ExtentTest extentTest){
        threadLocalExtentTest.set(extentTest);
    }

    static void unload(){
        threadLocalExtentTest.remove();
    }

}
