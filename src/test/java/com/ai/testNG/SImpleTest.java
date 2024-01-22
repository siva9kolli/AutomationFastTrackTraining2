package com.ai.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SImpleTest {

    @Test(priority = 1)
    public void register(){
        System.out.println("register Executing");
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = "register")
    public void login(){
        System.out.println("login Executing");
        Assert.assertFalse(false);
    }

    @Test(dependsOnMethods = "login")
    public void bookTicket(){
        System.out.println("bookTicket Executing");
        Assert.assertFalse(true);
    }

    @Test(dependsOnMethods = "bookTicket")
    public void paymentConformation(){
        System.out.println("paymentConformation Executing");
        Assert.assertFalse(true);
    }

    @Test
    public void guestBooking(){
        System.out.println("guestBooking Executing");
        Assert.assertTrue(true);
    }

}
