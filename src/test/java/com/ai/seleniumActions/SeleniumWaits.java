package com.ai.seleniumActions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumWaits {
    WebDriver driver;

    @BeforeClass
    public void initialize(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
    }

    @AfterTest
    public void killSession(){
        driver.quit();
    }


    @Test
    public void understandImplicitWait(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.name("start my free trial")).isDisplayed();

    }

    @Test
    public void explicitWebDriverWait(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(By.name("start my free tria")));

    }

    @Test
    public void explicitFluentWait(){
        FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .withMessage("Element not found after waiting for max wait")
                .ignoring(NoSuchElementException.class);

        fluentWait.until(ExpectedConditions.elementToBeClickable(By.name("start my free tria")));
    }

}
