package com.sgx.driver;

import com.sgx.driver.entity.WebDriverData;
import org.openqa.selenium.WebDriver;

public interface IWebDriver {
    WebDriver getDriver(WebDriverData driverData);
}
