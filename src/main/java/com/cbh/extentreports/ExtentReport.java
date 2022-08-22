package com.cbh.extentreports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

public final class ExtentReport {

    private static ExtentReports extent;
    //public static ExtentTest test;
    private ExtentReport(){

    }

    public static void initReports(){
        if (Objects.isNull(extent)){
            extent = new ExtentReports();
            ExtentSparkReporter sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/extent-test-output/index.html_"+System.currentTimeMillis());
            extent.attachReporter(sparkReporter);

            sparkReporter.config().setTheme(Theme.DARK);
            sparkReporter.config().setDocumentTitle("ClipBoard Health Automation Report");
            sparkReporter.config().setReportName("ClipBoard Health Automation Report");
        }

    }

    public static void createTest(String testcasename){
        ExtentTest test = extent.createTest(testcasename);
        ExtentManager.setExtentTest(test);
    }

    public static void flushReports() throws IOException {
       if(Objects.nonNull(extent)){
           extent.flush();
       }
        Desktop.getDesktop().browse(new File("index.html").toURI());

    }



    @Test
    public void test1() throws IOException {
        ExtentReports extent = new ExtentReports();
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("index.html");
        extent.attachReporter(sparkReporter);

        sparkReporter.config().setTheme(Theme.DARK);
        sparkReporter.config().setDocumentTitle("ClipBoard Health Automation Report");
        sparkReporter.config().setReportName("ClipBoard Health Automation Report");

        ExtentTest test = extent.createTest("First Test");
        test.pass("Checking the logs");

        ExtentTest test1 = extent.createTest("Second Test");
        test.fail("Checking the logs in the second test");

        extent.flush();

        Desktop.getDesktop().browse(new File("index.html").toURI());

    }


}
