package com.jzx.nanjing.dao;

import com.jzx.nanjing.model.Watermelo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WatermeloDao {

    Watermelo queryById(Integer id);

}