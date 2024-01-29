package com.ai.seleniumActions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class MultipleWindows {
    WebDriver driver;

    @BeforeClass
    public void initialize(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
    }

    @AfterTest
    public void killSession(){
        driver.quit();
    }

    @Test
    public void switchingWindows() throws InterruptedException {
        String parentWindowId = driver.getWindowHandle();
        System.out.println(parentWindowId);
        //driver.findElement(By.cssSelector("li[aria-label='Selenium in Twitter']")).click();
        WebElement twitterLogo = driver.findElement(By.cssSelector("a[aria-label='Selenium in Twitter']"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        String scrollToEle = "return arguments[0].scrollIntoView(true)";
        jse.executeScript(scrollToEle, twitterLogo);
        jse.executeScript("return arguments[0].click()", twitterLogo);
        Thread.sleep(5000);

        Set<String> windowIds = driver.getWindowHandles();
        System.out.println(windowIds); // parent, child
        for(String window : windowIds){
            driver.switchTo().window(window);
        }

       // Assert.assertTrue(driver.getTitle().contains( "Selenium"));
        driver.close(); // closing 2nd window
        driver.switchTo().window(parentWindowId);
        Assert.assertTrue(twitterLogo.isDisplayed());
     }
}
