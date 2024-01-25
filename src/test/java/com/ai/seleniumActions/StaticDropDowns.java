package com.ai.seleniumActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class StaticDropDowns {

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
    public void handleDropDown(){

        WebElement countryDropDown = driver.findElement(By.name("CompanyCountry"));

        Select countryList = new Select(countryDropDown);
        countryList.selectByVisibleText("Latvia");
        System.out.println(countryList.getFirstSelectedOption().getText());
        Assert.assertEquals(countryList.getFirstSelectedOption().getText(), "Latvia");

        countryList.selectByIndex(1);
        System.out.println(countryList.getFirstSelectedOption().getText());
        Assert.assertEquals(countryList.getFirstSelectedOption().getText(), "United States");

        countryList.selectByValue("IN");
        System.out.println(countryList.getFirstSelectedOption().getText());
        Assert.assertEquals(countryList.getFirstSelectedOption().getText(), "India");

        System.out.println(countryList.getOptions().size());
        System.out.println(countryList.isMultiple());

    }

}
