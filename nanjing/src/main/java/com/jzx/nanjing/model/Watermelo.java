package com.jzx.nanjing.model;

import java.io.Serializable;
import lombok.Data;

/**
 * watermelo
 * @author 
 */
@Data
public class Watermelo implements Serializable {
    private Integer id;

    private String name;

    private WaterMeloExtend waterMeloExtend;
}