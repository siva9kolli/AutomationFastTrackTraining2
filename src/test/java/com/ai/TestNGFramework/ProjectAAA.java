package com.ai.TestNGFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class ProjectAAA {

    public WebDriver driver;

    @BeforeSuite
    public void initializeDrivers(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @BeforeTest
    public void launchApplication(){
        driver.get("https://www.saucedemo.com/");
    }

    @AfterSuite
    public void killSession(){
        driver.quit();
    }
}
