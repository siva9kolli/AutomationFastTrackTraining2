package com.ai.seleniumActions;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class HandlingScreenshot {

    WebDriver driver;

    @BeforeClass
    public void initialize(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBrowserVersion("119");

        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(12));
    }

   // @AfterTest
    public void killSession(){
        driver.quit();
    }

    @Test
    public void getFullScreenShot() throws IOException {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destination = new File(System.getProperty("user.dir")+"/screenshots/page.png");
        FileUtils.copyFile(source, destination);

    }

    @Test
    public void getElementScreenShot() throws IOException {
        WebElement element = driver.findElement(By.xpath("//*[text()='Basic Auth']"));
     //   TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File source = element.getScreenshotAs(OutputType.FILE);
        File destination = new File(System.getProperty("user.dir")+"/screenshots/element.png");
        FileUtils.copyFile(source, destination);

    }
}
