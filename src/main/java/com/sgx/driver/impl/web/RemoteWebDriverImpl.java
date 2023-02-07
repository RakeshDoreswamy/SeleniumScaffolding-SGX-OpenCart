package com.sgx.driver.impl.web;

import com.sgx.driver.IWebDriver;
import com.sgx.driver.entity.WebDriverData;
import com.sgx.driver.factory.web.remote.RemoteDriverFactory;
import org.openqa.selenium.WebDriver;

public class RemoteWebDriverImpl implements IWebDriver {
    @Override
    public WebDriver getDriver(WebDriverData driverData) {
        return RemoteDriverFactory.getDriver(driverData.getBrowserRemoteModeType()
                ,driverData.getBrowserType());
    }
}
