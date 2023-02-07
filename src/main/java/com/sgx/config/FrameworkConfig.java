package com.sgx.config;

import com.sgx.config.converters.*;
import com.sgx.enums.BrowserRemoteModeType;
import com.sgx.enums.BrowserType;
import com.sgx.enums.MobileRemoteModeType;
import com.sgx.enums.RunModeType;
import org.aeonbits.owner.Config;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/config.properties",
        "file:${user.dir}/src/test/resources/staging-config.properties",
        "file:${user.dir}/src/test/resources/qa-config.properties"
})
public interface FrameworkConfig extends Config {

    @DefaultValue("staging")
    String environment();

    @Key("${environment}.webUrl")
    String webUrl();

    @DefaultValue("CHROME")
    @ConverterClass(StringToBrowserTypeConverter.class)
    BrowserType browser();

    @Key("runModeBrowser")
    @ConverterClass(StringToRunModeBrowserTypeConverter.class)
    RunModeType browserRunMode();

    @Key("browserRemoteMode")
    @ConverterClass(StringToRemoteModeBrowserTypeConverter.class)
    BrowserRemoteModeType browserRemoteMode();

    @Key("runModeMobile")
    @ConverterClass(StringToRunModeBrowserTypeConverter.class)
    RunModeType mobileRunMode();

    @Key("mobileRemoteMode")
    @ConverterClass(StringToMobileRemoteModeTypeConverter.class)
    MobileRemoteModeType mobileRemoteMode();

    @ConverterClass(StringToURLConverter.class)
    URL seleniumGridURL();

    @ConverterClass(StringToURLConverter.class)
    URL selenoidURL();

    @ConverterClass(StringToURLConverter.class)
    @DefaultValue("http://127.0.0.1:4723/wd/hub")
    URL localAppiumServerURL();


}
