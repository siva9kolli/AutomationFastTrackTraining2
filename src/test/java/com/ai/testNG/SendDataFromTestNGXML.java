package com.ai.testNG;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SendDataFromTestNGXML {

    //public String browser = "Chrome";

    @Parameters({"bs"})
    @BeforeSuite
    public void initializeReports(String browserName){
        System.out.println("Start Reporting");
        System.out.println("Start Driver :: " + browserName);
    }

    @Parameters({"username", "password"})
    @BeforeTest
    public void launchApplication(String un, String pwd){
        System.out.println("BeforeTest");
        System.out.println("For launching the application");
        System.out.println("Login :: " + un + " && " + pwd );
    }

    @Test
    public void paramTest(){
        System.out.println("Test Params");
    }
}
