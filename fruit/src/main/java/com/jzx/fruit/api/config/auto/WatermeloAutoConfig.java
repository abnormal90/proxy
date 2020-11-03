package com.jzx.fruit.api.config.auto;

import com.example.api.service.WatermelonService;
import com.jzx.fruit.api.factory.WaterMeloFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @program: fruit
 * @description:
 * @author: jzx
 * @create: 2020-11-02 13:43
 **/
@Configuration
public class WatermeloAutoConfig {


    @Bean
    public WaterMeloFactory waterMeloFactory(ApplicationContext applicationContext){
        return new WaterMeloFactory(applicationContext, WatermelonService.class);
    }

    @Bean
    @Primary
    public WatermelonService watermelonServiceProxy(WaterMeloFactory waterMeloFactory) throws Exception{
        return (WatermelonService) waterMeloFactory.getObject();
    }
}
