package com.cbh.config.factory;

import com.cbh.config.FrameworkConfig;
import org.aeonbits.owner.ConfigCache;

public final class ConfigFactory {

    private ConfigFactory(){}

    public static FrameworkConfig getConfig(){
        return ConfigCache.getOrCreate(FrameworkConfig.class);
    }
}
