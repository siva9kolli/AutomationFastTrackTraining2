package com.ai.TestNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
        private WebDriver driver;
    public ProductsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".app_logo")
    private WebElement productsHeading;

    @FindBy(css = ".bm-burger-button")
    private WebElement hamburgerMenu;

    @FindBy(css = "#logout_sidebar_link")
    private WebElement logoutLink;

    public boolean verifyProductsPageHeading(){
        return productsHeading.isDisplayed();
    }

    public String getHeadingMessage(){
        return productsHeading.getText();
    }

    public int getNumberOfSwagHeadings(){
        return driver.findElements(By.cssSelector(".app_logo")).size();
    }

    public void logOut(){
        hamburgerMenu.click();
        logoutLink.click();
    }
}
