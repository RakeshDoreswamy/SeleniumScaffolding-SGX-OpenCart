package com.cbh.driver;

import com.cbh.driver.entity.WebDriverData;
import org.openqa.selenium.WebDriver;

public interface IWebDriver {
    WebDriver getDriver(WebDriverData driverData);
}
