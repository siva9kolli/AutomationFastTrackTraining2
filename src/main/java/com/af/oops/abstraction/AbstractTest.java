package com.af.oops.abstraction;

public class AbstractTest extends AbstractA{

    @Override
    public void bookTicket() {
        System.out.println("Book Ticket");
    }

    @Override
    public void payment() {
        System.out.println("Payment");
    }
}
