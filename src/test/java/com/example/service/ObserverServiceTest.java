package com.example.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Observer;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ObserverServiceTest {
    @Resource
    ObserverService observerService;
    @Test
    public void test() {
        observerService.saveOrder();
    }
}
