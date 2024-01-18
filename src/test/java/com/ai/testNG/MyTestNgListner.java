package com.ai.testNG;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestNgListner implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result){
        System.out.println("onTestSuccess");
    }

    @Override
    public void onTestFailure(ITestResult result){
        System.out.println("onTestFailure");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped");
    }
}
