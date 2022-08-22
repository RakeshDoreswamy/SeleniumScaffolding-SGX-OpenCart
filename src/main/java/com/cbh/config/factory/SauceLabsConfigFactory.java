package com.cbh.config.factory;

import com.cbh.config.SauceLabsConfig;
import org.aeonbits.owner.ConfigCache;

public final class SauceLabsConfigFactory {

    private SauceLabsConfigFactory(){}

    public static SauceLabsConfig getConfig(){
        return ConfigCache.getOrCreate(SauceLabsConfig.class);
    }
}
