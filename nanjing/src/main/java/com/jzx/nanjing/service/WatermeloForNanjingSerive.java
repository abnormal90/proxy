package com.jzx.nanjing.service;

import com.example.api.service.WatermelonService;
import com.jzx.nanjing.config.Config;

/**
 * @program: nanjing
 * @description:
 * @author: jzx
 * @create: 2020-11-02 11:13
 **/
public interface WatermeloForNanjingSerive extends WatermelonService {

    @Override
    default boolean verify(String version) {
        return Config.NAN_JING.equals(version);
    }

    @Override
    default int order() {
        return 1;
    }
}
