package com.sgx.driver.impl.mobile;

import com.sgx.driver.IMobileDriver;
import com.sgx.driver.entity.MobileDriverData;
import com.sgx.driver.factory.mobile.remote.RemoteMobileDriverFactory;
import org.openqa.selenium.WebDriver;

public class RemoteMobileDriverImpl implements IMobileDriver {

    @Override
    public WebDriver getDriver(MobileDriverData driverData) {
        return RemoteMobileDriverFactory.getDriver(driverData.getMobileRemoteModeType()
                ,driverData.getMobilePlatformType());
    }
}
