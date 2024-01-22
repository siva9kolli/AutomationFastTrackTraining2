package com.ai.oops.interfaceAbstraction;

public class InterfaceTest extends InterfaceImplementation{
    public static void main(String[] args) {
        InterfaceTest interfaceTest = new InterfaceTest();
        interfaceTest.test1();
        interfaceTest.test2();

        InterfaceImplementation interfaceImplementation = new InterfaceTest();
        interfaceImplementation.test1();

        InterfaceMain interfaceMain = new InterfaceTest();
        interfaceMain.test1();
        interfaceMain.test2();
    }
}
