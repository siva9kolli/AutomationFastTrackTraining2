package com.ai.TestNGFramework;

import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest extends ProjectAAA{
    public LoginPage loginPage;
    public ProductsPage productsPage;

    @BeforeClass
    public void intializePages(){
        loginPage = new LoginPage(driver);
        productsPage = new ProductsPage(driver);
    }

    @DataProvider(name = "sauceUsers")
    public Object[][] sauceUsers(){
        return new Object[][]{
                {"standard_user","secret_sauce"},
                {"problem_user","secret_sauce"},
                {"performance_glitch_user","secret_sauce"},
                {"visual_user","secret_sauce"},
                {"error_user","secret_sauce"}
        };
    }


    @Test(dataProvider = "sauceUsers")
    public void verifySuccessfulLogin(String username, String password){
        loginPage.login(username,password);
        Assert.assertTrue(productsPage.verifyProductsPageHeading());
        Assert.assertEquals(productsPage.getHeadingMessage(), "Swag Labs");
        Assert.assertTrue(productsPage.getNumberOfSwagHeadings() == 1);
    }

    @AfterMethod
    public void logoutOfTheApplication(){
        productsPage.logOut();
    }
}
