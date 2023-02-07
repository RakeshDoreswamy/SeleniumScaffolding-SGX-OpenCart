package com.sgx.driver.impl.mobile;

import com.sgx.driver.IMobileDriver;
import com.sgx.driver.entity.MobileDriverData;
import com.sgx.driver.factory.mobile.local.LocalMobileDriverFactory;
import org.openqa.selenium.WebDriver;

public class LocalMobileDriverImpl implements IMobileDriver {

    @Override
    public WebDriver getDriver(MobileDriverData driverData) {
        return LocalMobileDriverFactory.getDriver(driverData.getMobilePlatformType());
    }
}
