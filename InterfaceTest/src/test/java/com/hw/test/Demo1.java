package com.hw.test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Demo1 {
    @Test
    public void test(){
        System.out.println("hello world");
    }



    @BeforeSuite
    public void beforesuite(){
        System.out.println("测试套之前");
    }

    @AfterSuite
    public void aftersuite(){
        System.out.println("测试套之后");
    }
}
