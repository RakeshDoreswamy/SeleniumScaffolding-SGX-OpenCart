package com.sgx.driver.entity;

import com.sgx.enums.BrowserRemoteModeType;
import com.sgx.enums.BrowserType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class WebDriverData {
    private BrowserType browserType;
    private BrowserRemoteModeType browserRemoteModeType;
}
