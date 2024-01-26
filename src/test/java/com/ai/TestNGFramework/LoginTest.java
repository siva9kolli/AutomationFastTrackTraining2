package com.ai.TestNGFramework;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest extends ProjectAAA{
    public LoginPage loginPage;
    public ProductsPage productsPage;

    @BeforeClass
    public void intializePages(){
        loginPage = new LoginPage(driver);
        productsPage = new ProductsPage(driver);
    }

    @Test
    public void verifySuccessfulLogin(){
        loginPage.login("standard_user","secret_sauce");
        Assert.assertTrue(productsPage.verifyProductsPageHeading());
        Assert.assertEquals(productsPage.getHeadingMessage(), "Swag Labs");
        Assert.assertTrue(productsPage.getNumberOfSwagHeadings() == 1);
        //loginPage.loginAsAdmin();
    }
}
