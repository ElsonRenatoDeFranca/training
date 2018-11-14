package com.example.training.springboot.demo;

import com.example.training.springboot.controller.DemoAppController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApp01ApplicationTests {

    @Autowired
    private DemoAppController demoAppController;

    @Test
    public void contextLoads() {
        //assertThat(demoAppController).isNotNull();
    }

}
