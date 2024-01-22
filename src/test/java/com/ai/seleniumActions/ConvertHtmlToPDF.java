package com.ai.seleniumActions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.Pdf;
import org.openqa.selenium.PrintsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.print.PrintOptions;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ConvertHtmlToPDF {

    @Test
    public void printTest() throws IOException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev");
      //  printer = (PrintsPage) driver;

        PrintOptions printOptions = new PrintOptions();
        printOptions.setPageRanges("1-2");

        Pdf pdf = ((PrintsPage)driver).print(printOptions);
        String content = pdf.getContent();
        System.out.println(content);
        Files.write(Paths.get("./PDF_Extract/test.pdf"), OutputType.BYTES.convertFromBase64Png(pdf.getContent()));
        driver.quit();

    }
}
