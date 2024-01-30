package com.ai.seleniumActions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class HandleShadow {


    WebDriver driver;

    @BeforeClass
    public void initialize(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.salesforce.com/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
    }

    @AfterTest
    public void killSession(){
        driver.quit();
    }

    @Test
    public void handleShadowDom() throws InterruptedException {
        SearchContext showdomMainElement = driver.findElement(By.xpath("(//*[@origin='https://wp.sfdcdigital.com/en-in/wp-json'])[1]")).getShadowRoot();
        WebElement element = showdomMainElement.findElement(By.cssSelector("[data-tracking-type='cta-utility']"));

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("return arguments[0].click()", element);
        Thread.sleep(5000);
        //showdomMainElement.findElement(By.cssSelector("[data-tracking-type='cta-utility']")).click();
        System.out.println("");
    }

    @Test
    public void test2ShadowRootHandling(){
        driver.navigate().to("https://books-pwakit.appspot.com/");
        WebElement rootElement = driver.findElement(By.cssSelector("[apptitle=\"BOOKS\"]"));
        SearchContext mainRootElement = rootElement.getShadowRoot();


        mainRootElement.findElement(By.cssSelector("[aria-label=\"Search Books\"]")).sendKeys("Selenium");
        System.out.println("Test");
    }
    //svg
    // //span[text()='Home']/../parent::div/div/*[name()='svg']
}
