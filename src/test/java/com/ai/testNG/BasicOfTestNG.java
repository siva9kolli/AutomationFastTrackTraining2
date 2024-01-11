package com.ai.testNG;

import org.testng.annotations.*;

import java.sql.SQLOutput;

public class BasicOfTestNG {
// Test Automation Framework
public void login(){
    System.out.println("Login Test");
}
    public void payment(){
        System.out.println("Payment Test");
    }


    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod");
        System.out.println("Login for every test");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass");
        System.out.println("Type of usage, Initialize pages");
    }

    @Test
    public void firstTest(){
        System.out.println("First Test Result");
        login();
    }

    @Test
    public void secondTest(){
        System.out.println("Second Test Result");
        payment();
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("BeforeTest");
        System.out.println("For launching the application");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite");
        System.out.println("Report Initialization");
        System.out.println("Driver Initialization");
    }
}
