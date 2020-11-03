package com.example.api.model;

import java.util.Map;

/**
 * @program: api
 * @description:
 * @author: jzx
 * @create: 2020-10-30 17:14
 **/
public class WatermelonVo {

    private Integer id;

    private String name;

    private Map<String,Object> extendData;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Object> getExtendData() {
        return extendData;
    }

    public void setExtendData(Map<String, Object> extendData) {
        this.extendData = extendData;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"name\":\"")
                .append(name).append('\"');
        sb.append(",\"extendData\":")
                .append(extendData);
        sb.append('}');
        return sb.toString();
    }
}
