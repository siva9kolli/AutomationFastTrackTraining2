package com.ai.seleniumActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Collections;

public class HandleEdgeAutomationPop {
    WebDriver driver;

    @Test
    public void initialize(){
        EdgeOptions edgeOptions = new EdgeOptions();

        edgeOptions.setExperimentalOption("useAutomationExtension", false);
        edgeOptions.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));

        driver = new EdgeDriver(edgeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterTest
    public void killSession(){
        driver.quit();
    }

}
