package com.ai.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.sql.SQLOutput;

public class HardAssertVsSoftAssert {

    int age = 17;
    boolean test = true;
    String str = "Selenium";

    @Test
    public void hSTest(){
        SoftAssert sf = new SoftAssert();

        sf.assertEquals(age, 19);

        sf.assertFalse(true);

        sf.assertTrue(age == 17);
        sf.assertAll();

    }

}
