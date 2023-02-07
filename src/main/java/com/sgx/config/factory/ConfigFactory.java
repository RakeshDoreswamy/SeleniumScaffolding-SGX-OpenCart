package com.sgx.config.factory;

import com.sgx.config.FrameworkConfig;
import org.aeonbits.owner.ConfigCache;

public final class ConfigFactory {

    private ConfigFactory(){}

    public static FrameworkConfig getConfig(){
        return ConfigCache.getOrCreate(FrameworkConfig.class);
    }
}
