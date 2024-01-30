package com.ai.seleniumActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class HandlingFrames {

    WebDriver driver;

    @BeforeClass
    public void initialize(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
    }

    @AfterTest
    public void killSession(){
        driver.quit();
    }

    @Test
    public void switchToFrames(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame(driver.findElement(By.cssSelector("[src='/frame_left']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[normalize-space()='LEFT']")));

        driver.switchTo().parentFrame();
        driver.switchTo().frame(driver.findElement(By.cssSelector("[src='/frame_middle']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#content")));

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-bottom");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[normalize-space()='BOTTOM']")));
        driver.switchTo().defaultContent();





    }
}
