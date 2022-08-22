package com.cbh.driver;

import com.cbh.driver.entity.MobileDriverData;
import org.openqa.selenium.WebDriver;

public interface IMobileDriver {
    WebDriver getDriver(MobileDriverData driverData);
}
