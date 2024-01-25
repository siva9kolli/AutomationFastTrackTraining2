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

public class VerifyErrorMessages {

    WebDriver driver;

    @BeforeClass
    public void initialize(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");
    }

    @AfterTest
    public void killSession(){
        driver.quit();
    }

    @Test
    public void verifyErrorMessagesOfAllInputs(){
        //driver.findElement(By.name("start my free trial")).click();
        WebElement freeTrailButton = driver.findElement(By.name("start my free trial"));
        clickWebElement(freeTrailButton);

        WebElement usernameInputBoxErrorMessage = driver.findElement(By.xpath("//label[normalize-space()='First name']/following-sibling::span"));
        System.out.println("Username Input Error message :: " + usernameInputBoxErrorMessage.getText().trim());
        Assert.assertEquals(usernameInputBoxErrorMessage.getText().trim(), "Enter your first name");
    }

    public void clickWebElement(WebElement element){
       // WebElement element = null; //= driver.findElement(By.name("start my free trial"));
        element.click();
    }



    @Test
    public void testSum(){
        sum(50, 70);
    }

    public void sum(int a, int b){
        //int a = 10, b= 10;
        int c = a+b;
        System.out.println(c);
    }
}
