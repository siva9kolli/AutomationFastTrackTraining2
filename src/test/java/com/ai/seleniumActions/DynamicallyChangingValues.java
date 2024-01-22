package com.ai.seleniumActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class DynamicallyChangingValues {

    WebDriver driver;

    @BeforeClass
    public void initialize(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/");
    }


    @AfterTest
    public void killSession(){
        driver.quit();
    }

    @Test
    public void verifyFrequentlyChangingText(){
        driver.findElement(By.partialLinkText("Testing")).click();
        String heading = driver.findElement(By.tagName("h3")).getText();
        System.out.println(heading);
        //Assert.assertEquals(heading, "A/B Test Variation 1");
        List<String> headings = new ArrayList<>();
        headings.add("A/B Test Variation 1");
        headings.add("A/B Test Control");
        Assert.assertTrue(headings.contains(heading));
    }
}
