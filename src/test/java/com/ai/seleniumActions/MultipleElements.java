package com.ai.seleniumActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class MultipleElements {
    WebDriver driver;

    @BeforeClass
    public void initialize(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterTest
    public void killSession(){
        driver.quit();
    }

    @Test
    public void verifyElementsPresentOnthePage(){
        List<WebElement> addButton = driver.findElements(By.partialLinkText("Add"));
        System.out.println(addButton.size());
        addButton.get(0).click();

        for (int i=0; i<5; i++){
            driver.findElement(By.xpath("//*[text()='Add Element']")).click();
        }

        List<WebElement> deleteButtons = driver.findElements(By.xpath("//*[text()='Delete']"));
        System.out.println("deleteButtons :: " + deleteButtons.size()  );
    }
}
