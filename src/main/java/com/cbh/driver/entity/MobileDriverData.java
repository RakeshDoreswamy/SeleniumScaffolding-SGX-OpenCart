package com.cbh.driver.entity;

import com.cbh.enums.MobilePlatformType;
import com.cbh.enums.MobileRemoteModeType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MobileDriverData {

    private MobilePlatformType mobilePlatformType;
    private MobileRemoteModeType mobileRemoteModeType;
}
