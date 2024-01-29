package com.dataManager.ReadData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcelFile {

    public static void main(String[] args) throws IOException {

        File file1 = new File("/Users/shiva/Documents/AutomationFastTrackTraining2/TestData/usersData.xlsx");
        File file = new File(System.getProperty("user.dir") + "/TestData/usersData.xlsx");

        FileInputStream fileInputStream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("sauceUsers");
        String cellValue = sheet.getRow(1).getCell(1).toString();
        System.out.println(cellValue);
    }

}
