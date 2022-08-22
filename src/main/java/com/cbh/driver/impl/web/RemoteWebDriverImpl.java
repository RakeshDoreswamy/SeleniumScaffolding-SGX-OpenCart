package com.cbh.driver.impl.web;

import com.cbh.driver.IWebDriver;
import com.cbh.driver.entity.WebDriverData;
import com.cbh.driver.factory.web.remote.RemoteDriverFactory;
import org.openqa.selenium.WebDriver;

public class RemoteWebDriverImpl implements IWebDriver {
    @Override
    public WebDriver getDriver(WebDriverData driverData) {
        return RemoteDriverFactory.getDriver(driverData.getBrowserRemoteModeType()
                ,driverData.getBrowserType());
    }
}
