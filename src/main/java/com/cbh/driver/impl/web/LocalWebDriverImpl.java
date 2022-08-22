package com.cbh.driver.impl.web;

import com.cbh.driver.IWebDriver;
import com.cbh.driver.entity.WebDriverData;
import com.cbh.driver.factory.web.local.LocalDriverFactory;
import org.openqa.selenium.WebDriver;

public class LocalWebDriverImpl implements IWebDriver {

    @Override
    public WebDriver getDriver(WebDriverData driverData) {
        return LocalDriverFactory.getDriver(driverData.getBrowserType());
    }
}
