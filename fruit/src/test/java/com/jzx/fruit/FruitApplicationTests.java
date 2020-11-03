package com.jzx.fruit;

import com.example.api.service.WatermelonService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FruitApplicationTests {

    @Autowired
    private WatermelonService watermelonService;

    @Test
    void contextLoads() {
        System.out.println(watermelonService.find(null));
    }

}
