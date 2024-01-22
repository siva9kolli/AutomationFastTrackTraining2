package com.ai.seleniumActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class LaunchingBrowsers {
    WebDriver driver;

    @Test
    public void launchBrowser(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBrowserVersion("120");
        driver = new ChromeDriver();
        //RemoteWebDriver driver1 = new ChromeDriver();
         //ChromeDriver chromeDriver = new ChromeDriver();
        //ChromiumDriver chromeDriver = new ChromeDriver();
        driver.get("http://127.0.0.1:5500/test/specs/automation.html");
        driver.findElement(By.name("username")).sendKeys("Selenium");
        driver.findElement(By.name("password")).sendKeys("Automation");

        // WebDriver driver = new WebDriver();
        /*
        Cannot create object with Interface
        When Interface(WebDriver) is implemented then we implements methods form that interface in RemoteWebDriver
        and ChromiumDriver inherits RemoteWebDriver
        and ChromeDriver inherits ChromiumDriver
        WebDriver driver = new ChromeDriver();
         */
    }
}
