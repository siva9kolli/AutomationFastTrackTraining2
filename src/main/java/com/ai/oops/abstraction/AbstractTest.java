package com.ai.oops.abstraction;


//Like ChromeDriver
public class AbstractTest extends AbstractImplementation{

    public static void main(String[] args) {
        AbstractTest abstractTest1 = new AbstractTest();

        AbstractImplementation abstractImplementation = new AbstractTest();

        AbstractMain abstractMain = new AbstractTest();
        AbstractMain abstractMain1 = new AbstractTest();

        abstractMain.login();
        abstractMain.bookTicket();
        abstractMain.payment();
    }
}
