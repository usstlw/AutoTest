package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void testCase1(){
        System.out.println("Test这是测试用例1");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethond这是在测试方法之前运行");
    }

    @Test
    public void testCase2(){
        System.out.println("Test这是测试用例2");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("Aftermethod是在测试方法之后运行");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass这是在类运行之前运行的方法");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterclass这是在类运行之后运行的方法");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite测试套件");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("Aftersuite测试套件");
    }



}
