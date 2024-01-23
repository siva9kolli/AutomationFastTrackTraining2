package com.ai.seleniumActions;

import org.openqa.selenium.WebElement;

import java.util.List;

public class CommonActions {

    public boolean isElementDisplayed(WebElement element){
        try{
            element.isDisplayed();
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public int getNumberOfElements(List<WebElement> elements){
        try{
            return elements.size();
        }catch (Exception e){
            return 0;
        }
    }
}
