package com.sgx.driver.entity;

import com.sgx.enums.MobilePlatformType;
import com.sgx.enums.MobileRemoteModeType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MobileDriverData {

    private MobilePlatformType mobilePlatformType;
    private MobileRemoteModeType mobileRemoteModeType;
}
