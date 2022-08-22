package com.cbh.driver.impl.mobile;

import com.cbh.driver.IMobileDriver;
import com.cbh.driver.entity.MobileDriverData;
import com.cbh.driver.factory.mobile.local.LocalMobileDriverFactory;
import org.openqa.selenium.WebDriver;

public class LocalMobileDriverImpl implements IMobileDriver {

    @Override
    public WebDriver getDriver(MobileDriverData driverData) {
        return LocalMobileDriverFactory.getDriver(driverData.getMobilePlatformType());
    }
}
