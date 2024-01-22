package com.ai.seleniumActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class SauceDemoLoginTest {
    WebDriver driver;

    @BeforeClass
    public void initialize(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void verifyLogin(){
        driver.get("https://www.saucedemo.com/");

        WebElement userNameInputBox = driver.findElement(By.id("user-name"));
        WebElement passwordInputBox = driver.findElement(By.name("password"));
        WebElement loginButton =  driver.findElement(By.cssSelector("#login-button"));
        userNameInputBox.sendKeys("standard_user");
        passwordInputBox.sendKeys("secret_sauce");
        loginButton.click();
        Assert.assertTrue(driver.getTitle().equals("Swag Labs"));

        Assert.assertEquals(driver.findElement(By.cssSelector(".title")).getText(), "Products");

    }

}
