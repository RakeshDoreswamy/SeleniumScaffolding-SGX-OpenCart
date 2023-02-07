package com.sgx.driver.impl.web;

import com.sgx.driver.IWebDriver;
import com.sgx.driver.entity.WebDriverData;
import com.sgx.driver.factory.web.local.LocalDriverFactory;
import org.openqa.selenium.WebDriver;

public class LocalWebDriverImpl implements IWebDriver {

    @Override
    public WebDriver getDriver(WebDriverData driverData) {
        return LocalDriverFactory.getDriver(driverData.getBrowserType());
    }
}
