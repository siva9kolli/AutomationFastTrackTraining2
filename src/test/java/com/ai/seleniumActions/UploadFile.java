package com.ai.seleniumActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class UploadFile {



    WebDriver driver;

    @BeforeClass
    public void initialize(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
    }

    @AfterTest
    public void killSession(){
        driver.quit();
    }

    @Test
    public void updloadFile(){
        driver.findElement(By.cssSelector("#file-upload")).sendKeys(System.getProperty("user.dir")+"/TestData/usersDetails.json");
        System.out.println("");
    }

    //AutoIT

}
