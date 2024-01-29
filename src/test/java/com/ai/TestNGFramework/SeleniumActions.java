package com.ai.TestNGFramework;

import org.openqa.selenium.WebElement;

public class SeleniumActions {

    public void clickOnWebElement(WebElement element){
        element.click();
    }

    public void typeValue(WebElement element, String data){
        element.sendKeys(data);
    }
}
