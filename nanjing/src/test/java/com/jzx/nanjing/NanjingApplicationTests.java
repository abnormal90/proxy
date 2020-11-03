package com.jzx.nanjing;

import com.example.api.service.WatermelonService;
import com.jzx.nanjing.dao.WatermeloDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"dev"})
@SpringBootTest
class NanjingApplicationTests {

    @Autowired
    private WatermeloDao watermeloDao;

    @Autowired
    private WatermelonService watermelonService;

    @Test
    void contextLoads() {
//        System.out.println(watermeloDao.queryById(1));
        System.out.println(watermelonService.find(null));
    }

}
