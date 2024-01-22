package com.ai.testNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class GroupsTestNG {
    public void login(){
        System.out.println("Login Test");
    }
    public void payment(){
        System.out.println("Payment Test");
    }


    @Test(groups = {"smoke","salesforce"})
    public void firstTest(){
        System.out.println("First Test Result");
        login();
    }

    @Test(groups = {"smoke", "regression","salesforce"})
    public void secondTest(){
        System.out.println("Second Test Result");
        payment();
    }

    @Ignore
    @Test
    public void thirdTest(){
        System.out.println("Third Test Result");
    }
}
