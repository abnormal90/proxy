package com.example.api.service;

import com.example.api.ISpi;
import com.example.api.model.WatermelonVo;
import com.example.api.model.WatermelonDTO;

/**
 * @program: api
 * @description:
 * @author: jzx
 * @create: 2020-10-30 17:10
 **/
public interface WatermelonService extends ISpi {

    WatermelonDTO find(WatermelonVo watermelon);
}
