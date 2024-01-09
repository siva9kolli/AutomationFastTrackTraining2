package com.ai.aboutExceptions;

import java.io.Serializable;

public class ExceptionTestHierarchy {

    public static void main(String[] args) {
        String str;
        int a = 5;
        String s[] = {"Selenium", "Appium"};
        char c = 'S';

        try {
            a = a / 1;
            System.out.println(a);
            String s2 = s[2];
        } catch (ArithmeticException ae) {
            ae.printStackTrace();
        } catch (IndexOutOfBoundsException ie) {
            ie.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            a = a / 0;
            String s1 = s[1];
            System.out.println(s1);
        } catch (IndexOutOfBoundsException ie) {
            ie.printStackTrace();
        } catch (ArithmeticException ae) {
            ae.printStackTrace();
        }
        catch (RuntimeException re){
            re.printStackTrace();
        }
        catch (Throwable se){
            se.printStackTrace();
        }
    }
}
