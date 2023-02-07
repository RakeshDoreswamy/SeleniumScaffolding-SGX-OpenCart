package com.sgx.driver;

import com.sgx.driver.entity.MobileDriverData;
import org.openqa.selenium.WebDriver;

public interface IMobileDriver {
    WebDriver getDriver(MobileDriverData driverData);
}
