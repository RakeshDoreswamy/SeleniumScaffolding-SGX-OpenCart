package com.sgx.config.factory;

import com.sgx.config.SauceLabsConfig;
import org.aeonbits.owner.ConfigCache;

public final class SauceLabsConfigFactory {

    private SauceLabsConfigFactory(){}

    public static SauceLabsConfig getConfig(){
        return ConfigCache.getOrCreate(SauceLabsConfig.class);
    }
}
