package com.ai.seleniumActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class VerifyCheckBoxes {

    WebDriver driver;

    @BeforeClass
    public void initialize(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/checkboxes");
    }

    @AfterTest
    public void killSession(){
        driver.quit();
    }

    @Test
    public void verifyElementsPresentOnthePage(){
        List<WebElement> checkBoxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
        System.out.println("Before click :: "+checkBoxes.get(0).isSelected());
        Assert.assertFalse(checkBoxes.get(0).isSelected());

        checkBoxes.get(0).click();
        System.out.println("After click :: "+checkBoxes.get(0).isSelected());
        Assert.assertTrue(checkBoxes.get(0).isSelected());



    }
}
