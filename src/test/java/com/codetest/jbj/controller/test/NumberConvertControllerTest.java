package com.codetest.jbj.controller.test;

import com.codetest.jbj.controller.NumberConvertController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class NumberConvertControllerTest {
    public NumberConvertControllerTest(){}

    @Autowired
    private NumberConvertController controller;

    @Test
    public void contexLoads() throws Exception {
        assertNotNull(controller);
    }
}
