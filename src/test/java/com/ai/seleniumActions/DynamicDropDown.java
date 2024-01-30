package com.ai.seleniumActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class DynamicDropDown {

    //setTimeout(()=>{debugger}, 5000)
    WebDriver driver;

    @BeforeClass
    public void initialize(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
    }

    @AfterTest
    public void killSession(){
        driver.quit();
    }

    @Test
    public void handleDynamicDD() throws InterruptedException {
        WebElement mainMenu = driver.findElement(By.xpath("//span[text()='Electronics']"));
       // WebElement subMenu = driver.findElement(By.xpath("//a[text()='Bluetooth Headphones']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(mainMenu).build().perform();
        Thread.sleep(1000);
        actions.click(driver.findElement(By.xpath("//a[text()='Bluetooth Headphones']"))).build().perform();
        Thread.sleep(5000);
        driver.getTitle().contains("Headphones");
        System.out.println("");

    }
}
