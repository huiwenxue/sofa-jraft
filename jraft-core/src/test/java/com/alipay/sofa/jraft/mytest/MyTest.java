package com.alipay.sofa.jraft.mytest;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyTest.class);
    @Test
    public void test01(){
        LOGGER.error("this is my first test");
    }

    @Test
    public void test02(){
        LOGGER.error("this is my second test");
    }

    @Test
    public void test03(){
        LOGGER.error("this is my third test");
    }
}
