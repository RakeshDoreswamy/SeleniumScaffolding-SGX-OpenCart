package com.sgx.driver;

import com.sgx.driver.entity.MobileDriverData;
import com.sgx.driver.entity.WebDriverData;
import com.sgx.driver.factory.DriverFactory;
import com.sgx.enums.MobilePlatformType;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

import static com.sgx.config.factory.ConfigFactory.*;

public final class Driver {

    private Driver(){}

    public static void initDriverForWeb(){
        if(Objects.isNull(DriverManager.getDriver())) {
            WebDriverData driverData = new WebDriverData
                    (getConfig().browser(), getConfig().browserRemoteMode());
            WebDriver driver = DriverFactory
                    .getDriverForWeb(getConfig().browserRunMode())
                    .getDriver(driverData);
            DriverManager.setDriver(driver);
            DriverManager.getDriver().manage().window().maximize();
            //DriverManager.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            loadURL();
        }
    }
    public static void loadURL(){
        DriverManager.getDriver().get(getConfig().webUrl());
    }
    public static void initDriverForMobile(){
        MobileDriverData driverData = new MobileDriverData(MobilePlatformType.ANDROID
                ,getConfig().mobileRemoteMode());
        WebDriver driver = DriverFactory
                .getDriverForMobile(getConfig().mobileRunMode())
                .getDriver(driverData);
        DriverManager.setDriver(driver);
    }
    public static void quitDriver(){
        if(Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver()
                    .quit();
            DriverManager.unload();
        }
    }
}
