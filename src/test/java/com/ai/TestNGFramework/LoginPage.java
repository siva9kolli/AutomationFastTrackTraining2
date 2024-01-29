package com.ai.TestNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;
    public SeleniumActions seleniumActions;

    public LoginPage(WebDriver driver){
        seleniumActions = new SeleniumActions();
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "user-name")
    private WebElement usernameInputBox;

    @FindBy(css = "#password")
    private WebElement passwordInputBox;

    @FindBy(css = ".submit-button.btn_action")
    private WebElement submitButton;

    By usernameInputField = By.name("user-name");
    By passwordInputField = By.cssSelector("#password");
    By loginButton = By.cssSelector(".submit-button.btn_action");

    public void loginAsAdmin(){
        driver.findElement(usernameInputField).sendKeys("standard_user");
        driver.findElement(passwordInputField).sendKeys("secret_sauce");
        driver.findElement(loginButton).click();
    }

    public void login(String username, String password){
        seleniumActions.typeValue(usernameInputBox, username);
        seleniumActions.typeValue(passwordInputBox, password);
        seleniumActions.clickOnWebElement(submitButton);
    }


}
