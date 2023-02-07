package com.sgx.config.factory;

import com.sgx.config.BrowserStackConfig;
import org.aeonbits.owner.ConfigCache;

public final class BrowserStackConfigFactory {

    private BrowserStackConfigFactory(){}

    public static BrowserStackConfig getConfig(){
        return ConfigCache.getOrCreate(BrowserStackConfig.class);
    }
}
