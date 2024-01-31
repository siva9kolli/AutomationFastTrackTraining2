package com.ai.seleniumActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class HandlingTablesWithDynamicData {

    WebDriver driver;
    String headerName = "Due";

    @BeforeClass
    public void initialize(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/tables");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
    }

    @AfterTest
    public void killSession(){
        driver.quit();
    }

    @Test
    public void handlingTables(){
        getUserDetails(headerName, "tconway@earthlink.net");
        List<String> headerDetails = getHeaderTitles();
        System.out.println(headerDetails.indexOf(headerName));
        int indexValue = headerDetails.indexOf(headerName)+1;

        List<WebElement> emails = driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th/span[text()='"+headerName+"']/ancestor::thead/following-sibling::tbody/tr/td["+indexValue+"]"));
        List<String> emailValues = new ArrayList<>();

        for(int i=0; i<emails.size(); i++){
            emailValues.add(emails.get(i).getText());
        }
        System.out.println(emailValues);
    }

    public List<String> getHeaderTitles(){
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th/span"));
        List<String> headerVales = new ArrayList<>();
        for(int i=0; i<headers.size(); i++){
            headerVales.add(headers.get(i).getText());
        }
        System.out.println(headerVales);
        return headerVales;
    }
    public List<String> getUserDetails(String headerColumnName, String userName ){
        String xpath = "//table[@id='table1']/thead/tr/th/span[text()='"+headerColumnName+"']/ancestor::thead/following-sibling::tbody/tr/td[text()='"+userName+"']/parent::tr/td";
        List<WebElement> userDetails = driver.findElements(By.xpath(xpath));
        List<String> userValues = new ArrayList<>();
        for (int i=0; i<userDetails.size()-1; i++){
            userValues.add(userDetails.get(i).getText());
        }
        System.out.println(userValues);
        return userValues;
    }
}
