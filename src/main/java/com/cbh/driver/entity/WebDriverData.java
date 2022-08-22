package com.cbh.driver.entity;

import com.cbh.enums.BrowserRemoteModeType;
import com.cbh.enums.BrowserType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class WebDriverData {
    private BrowserType browserType;
    private BrowserRemoteModeType browserRemoteModeType;
}
