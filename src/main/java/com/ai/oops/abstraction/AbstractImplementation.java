package com.ai.oops.abstraction;

//Like Remote WebDriver
public class AbstractImplementation extends AbstractMain{

    @Override
    public void bookTicket() {
        System.out.println("Book Ticket");
    }

    @Override
    public void payment() {
        System.out.println("Payment completed");
    }
}
