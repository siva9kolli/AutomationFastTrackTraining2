package com.ai.seleniumActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class HandleBasicAuth {

    WebDriver driver;

    @Test
    public void initialize(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://admin:admi23423n@the-internet.herokuapp.com/basic_auth");
        System.out.println("");
    }
}

