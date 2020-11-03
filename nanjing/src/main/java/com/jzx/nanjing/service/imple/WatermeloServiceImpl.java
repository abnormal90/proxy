package com.jzx.nanjing.service.imple;

import cn.hutool.core.bean.BeanUtil;
import com.example.api.model.WatermelonDTO;
import com.example.api.model.WatermelonVo;
import com.jzx.nanjing.dao.WatermeloDao;
import com.jzx.nanjing.model.Watermelo;
import com.jzx.nanjing.service.WatermeloForNanjingSerive;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: nanjing
 * @description:
 * @author: jzx
 * @create: 2020-11-02 09:39
 **/
@Service
public class WatermeloServiceImpl implements WatermeloForNanjingSerive {

    @Autowired
    private WatermeloDao watermeloDao;

    @Override
    public WatermelonDTO find(WatermelonVo watermelon) {
        System.out.println(watermelon);
        Watermelo watermelo = watermeloDao.queryById(1);

        WatermelonDTO dto = new WatermelonDTO();
        BeanUtils.copyProperties(watermelo,dto);
        dto.setExtendData(BeanUtil.beanToMap(watermelo.getWaterMeloExtend()));
        return dto;
    }

}
