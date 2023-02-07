package com.sgx.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

    //When ever a test is failed, this method retry will be called
    // if the method return true, then it will rerun
    // if the method return false, then it will not rerun
    // retry 3 times

    int counter=0;
    int limit=2;
    @Override
    public boolean retry(ITestResult result) {
        if(counter<limit){
            counter++;
            return true;
        }
        return false;
    }
}
