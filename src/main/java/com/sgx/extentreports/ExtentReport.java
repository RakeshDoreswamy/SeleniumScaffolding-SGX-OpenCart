package com.sgx.extentreports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.sgx.constants.FrameworkConstants;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

public final class ExtentReport {

    private static ExtentReports extent;
    public static ExtentTest extentTest;
    private ExtentReport(){

    }

    public static void initReports(){
        if (Objects.isNull(extent)){
            extent = new ExtentReports();
            ExtentSparkReporter sparkReporter = new ExtentSparkReporter(FrameworkConstants.getReportPath());
            extent.attachReporter(sparkReporter);

            sparkReporter.config().setTheme(Theme.DARK);
            sparkReporter.config().setDocumentTitle("SGX OpenCart Automation Report");
            sparkReporter.config().setReportName("SGX OpenCart Automation Report");
        }

    }

    public static void createTest(String testCaseName){
        extentTest= extent.createTest(testCaseName);
        ExtentManager.setExtentTest(extentTest);
    }

    public static void flushReports() throws IOException {
       if(Objects.nonNull(extent)){
           extent.flush();
       }
       Desktop.getDesktop().browse(new File("index.html").toURI());
    }
}
