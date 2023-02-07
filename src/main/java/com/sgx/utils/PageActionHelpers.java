package com.sgx.utils;

import com.sgx.driver.DriverManager;
import com.sgx.extentreports.ExtentLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.function.Consumer;
import java.util.function.Function;

public class PageActionHelpers {

    private PageActionHelpers(){}

    public static void waitAndClick(By by){
        new WebDriverWait(DriverManager.getDriver(),10).until(ExpectedConditions.presenceOfElementLocated(by));
        DriverManager.getDriver().findElement(by).click();
        ExtentLogger.pass(by + "is Clicked");
    }

    public static void waitAndJSClick(By by){
        new WebDriverWait(DriverManager.getDriver(),10).until(ExpectedConditions.presenceOfElementLocated(by));
        JavascriptExecutor js = (JavascriptExecutor)DriverManager.getDriver();
        js.executeScript("arguments[0].click()", DriverManager.getDriver().findElement(by));
        ExtentLogger.pass(by + "is Clicked");
    }

    public static void waitAndSendkeys(By by,String textToBeEntered){
        DriverManager.getDriver().findElement(by).sendKeys(textToBeEntered);
        ExtentLogger.pass(by + " keyed in data");
    }

    public static void uploadFile(By by,String filePath){
        DriverManager.getDriver().findElement(by).sendKeys(filePath);
        ExtentLogger.pass(by + " keyed in data");
    }

    public static void waitAndClearText(By by){
        DriverManager.getDriver().findElement(by).clear();
        ExtentLogger.pass(by + " data is cleared in the field");
    }

    public static void select(By by, Consumer<Select> consumer){
        consumer.accept(new Select(DriverManager.getDriver().findElement(by)));
        ExtentLogger.pass(by + "is Selected");
    }

    public static String getTextFromElement(By by,Function<WebElement,String> getTextFunction){
        return getTextFunction.apply(DriverManager.getDriver().findElement(by));
    }

    public static String getAttribute(By by, Function<WebElement,String> attributeFunction){
       return attributeFunction.apply(DriverManager.getDriver().findElement(by));
    }

    public static void jsWaitForLoad(int timeout){
        try{
            boolean blnIsPageLoadComplete = false;
            int intRetry = 0;
            do{
                blnIsPageLoadComplete = ((JavascriptExecutor)DriverManager.getDriver()).executeScript("return document.readyState").equals("complete");
                ++intRetry;
                try {
                    Thread.sleep(500);
                }catch (Exception e){

                }
            }while ((!blnIsPageLoadComplete) && (intRetry<(timeout)));
        }catch (Exception e){

        }
    }
}
