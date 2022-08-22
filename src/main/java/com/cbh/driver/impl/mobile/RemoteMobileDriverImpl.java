package com.cbh.driver.impl.mobile;

import com.cbh.driver.IMobileDriver;
import com.cbh.driver.entity.MobileDriverData;
import com.cbh.driver.factory.mobile.remote.RemoteMobileDriverFactory;
import org.openqa.selenium.WebDriver;

public class RemoteMobileDriverImpl implements IMobileDriver {

    @Override
    public WebDriver getDriver(MobileDriverData driverData) {
        return RemoteMobileDriverFactory.getDriver(driverData.getMobileRemoteModeType()
                ,driverData.getMobilePlatformType());
    }
}
