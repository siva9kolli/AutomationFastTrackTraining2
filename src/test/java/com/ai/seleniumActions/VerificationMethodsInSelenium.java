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

public class VerificationMethodsInSelenium extends CommonActions{

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
    public void verifyElementsPresentOnthePage(){
        WebElement startMyFreeTrainButton = driver.findElement(By.name("start my free trial"));
        List<WebElement> startMyFreeTrainButtons = driver.findElements(By.name("start my free trial"));

       Assert.assertTrue(startMyFreeTrainButton.isDisplayed());
       Assert.assertEquals(startMyFreeTrainButtons.size(), 1);

       WebElement agreementCheckBox = driver.findElement(By.xpath("//div[starts-with(@id,'SubscriptionAgreement')]/preceding-sibling::div"));
       System.out.println("Before click :: "+agreementCheckBox.isSelected());

        agreementCheckBox.click();
        System.out.println("After click :: "+agreementCheckBox.isSelected());



    }



}
