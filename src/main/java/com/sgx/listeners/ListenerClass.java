package com.sgx.listeners;

import com.sgx.extentreports.ExtentLogger;
import com.sgx.extentreports.ExtentReport;
import org.testng.*;

import java.io.IOException;

public class ListenerClass implements ITestListener, ISuiteListener {


    @Override
    public void onStart(ISuite suite) {
        ExtentReport.initReports();
    }

    @Override
    public void onFinish(ISuite suite) {
        try {
            ExtentReport.flushReports();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestStart(ITestResult result) {
        ExtentReport.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentLogger.pass(result.getMethod().getMethodName() + " is Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ExtentLogger.pass(result.getMethod().getMethodName() + " is Failed");
        //attach Screenshot
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ExtentLogger.pass(result.getMethod().getMethodName() + " is Skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }
}
