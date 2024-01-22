package com.ai.programs;

public class Conditions {
    public static void main(String[] args) {
        String str = "Selenium Automation";
        String automationTool = "Appium";

        switch (automationTool){
            case "Selenium":
                System.out.println("Web Automation Tool");
                break;
            case "Appium":
                System.out.println("Mobile Automation Tool");
                break;
            case "WebDriverIO":
                System.out.println("Angular/React Web Automation Tool");
                break;
            case "RestAssured":
                System.out.println("API Automation Tool");
                break;
            case "Pynt":
                System.out.println("Security Automation Tool");
                break;
            default:
                System.out.println("Provide right string");
        }


        if(true){
            System.out.println("Test Pass");
        }else {
            System.out.println("Test Pass");
        }

        if(false){
            System.out.println("Test fail");
        } else {
            System.out.println("Test Pass");
        }

        if(5>0){
            System.out.println("5>0 Test Pass");
        }else {
            System.out.println("Test Pass");
        }

        if(5<0){
            System.out.println("5<0 Test Pass");
        }else {
            System.out.println("Test Pass");
        }

       if(str.contains("S345345elenium")){
            System.out.println("Only Selenium");
        } else if(str.equalsIgnoreCase("selenium automknkjkxation")){
            System.out.println("full String with out case consideration");
        } else if(str.toLowerCase().equals("selenium automation")){
           System.out.println("full String with out case consideration");
        }






    }
}
