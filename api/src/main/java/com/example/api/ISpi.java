package com.example.api;

/**
 * @program: api
 * @description:
 * @author: jzx
 * @create: 2020-11-02 10:54
 **/
public interface ISpi {
    boolean verify(String version);

    default int order(){
        return 10;
    }
}
